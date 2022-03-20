package uz.learn.learningcentre.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.GroupingCriteria;
import uz.learn.learningcentre.dto.GroupingCreateDto;
import uz.learn.learningcentre.dto.GroupingDto;
import uz.learn.learningcentre.dto.GroupingUpdateDto;
import uz.learn.learningcentre.entity.AuthUser;
import uz.learn.learningcentre.entity.Grouping;
import uz.learn.learningcentre.entity.Subject;
import uz.learn.learningcentre.exceptions.BadRequestException;
import uz.learn.learningcentre.mapper.GroupingMapper;
import uz.learn.learningcentre.repository.AuthUserRepository;
import uz.learn.learningcentre.repository.GroupingRepository;
import uz.learn.learningcentre.repository.SubjectRepository;
import uz.learn.learningcentre.response.AppErrorDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.GroupingValidator;

import java.util.List;
import java.util.Optional;

@Service
public class GroupingService extends AbstractService<GroupingMapper, GroupingValidator, GroupingRepository>
        implements GenericCrudService<GroupingDto, GroupingCreateDto, GroupingUpdateDto>,
        GenericService<GroupingDto, GroupingCriteria> {


    private final SubjectRepository subjectRepository;
    private final AuthUserRepository userRepository;

    public GroupingService( GroupingMapper mapper , GroupingValidator validator , GroupingRepository repository , SubjectRepository subjectRepository , AuthUserRepository userRepository ) {
        super( mapper , validator , repository );
        this.subjectRepository = subjectRepository;
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<DataDto<Long>> create( GroupingCreateDto groupingCreateDto ) {
        try {
            validator.validOnCreate( groupingCreateDto );
            Subject subject = subjectRepository.findByName( groupingCreateDto.getSubject() );
            AuthUser mentor = userRepository.findByName( groupingCreateDto.getMentor() );
            Grouping grouping = mapper.fromCreateDto( groupingCreateDto );
            grouping.setSubjectId( subject.getId() );
            grouping.setMentorId( mentor.getId() );
            Grouping save = repository.save( grouping );
            return new ResponseEntity<>( new DataDto<>( save.getId() ) );
        } catch ( BadRequestException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.BAD_REQUEST , e.getMessage() ) ) );
        } catch ( IllegalArgumentException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.INTERNAL_SERVER_ERROR , e.getMessage() ) ) );
        }
    }

    @Override
    public ResponseEntity<DataDto<Long>> update( GroupingUpdateDto groupingUpdateDto ) {
        try {
            validator.validOnUpdate( groupingUpdateDto );
            Optional<Grouping> byId = repository.findById( groupingUpdateDto.getId() );
            if ( byId.isPresent() ) {
                Grouping grouping = mapper.fromUpdateDto( groupingUpdateDto , byId.get() );
                Grouping save = repository.save( grouping );
                return new ResponseEntity<>( new DataDto<>( save.getId() ) );
            }
            return new ResponseEntity<>( new DataDto<>( new AppErrorDto( HttpStatus.NOT_FOUND , "GROUP_NOT_FOUND" ) ) );
        } catch ( BadRequestException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.BAD_REQUEST , e.getMessage() ) ) );
        } catch ( IllegalArgumentException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.INTERNAL_SERVER_ERROR , e.getMessage() ) ) );
        }

    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete( Long id ) {
        try {
            validator.validOnId( id );
            Optional<Grouping> byId = repository.findById( id );
            byId.ifPresent( repository::delete );
            return new ResponseEntity<>( new DataDto<>( true ) );
        } catch ( BadRequestException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.BAD_REQUEST , e.getMessage() ) ) );
        } catch ( IllegalArgumentException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.INTERNAL_SERVER_ERROR , e.getMessage() ) ) );
        }
    }

    @Override
    public ResponseEntity<DataDto<GroupingDto>> get( Long id ) {
        try {
            validator.validOnId( id );
            Optional<Grouping> byId = repository.findById( id );
            if ( byId.isPresent() ) {
                GroupingDto groupingDto = mapper.toDto( byId.get() );
                return new ResponseEntity<>( new DataDto<>( groupingDto ) );
            }
            return new ResponseEntity<>( new DataDto<>( new AppErrorDto( HttpStatus.NOT_FOUND , "GROUP_NOT_FOUND" ) ) );
        } catch ( BadRequestException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.BAD_REQUEST , e.getMessage() ) ) );
        } catch ( IllegalArgumentException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.INTERNAL_SERVER_ERROR , e.getMessage() ) ) );
        }
    }

    @Override
    public ResponseEntity<DataDto<List<GroupingDto>>> getAll( GroupingCriteria criteria ) {
        try {
            Pageable pageable = PageRequest.of( criteria.getPage() , criteria.getSize() , Sort.by( "price" ).descending() );
            Page<Grouping> all = repository.findAll( pageable );
            List<Grouping> list = all.stream().toList();
            List<GroupingDto> dtos = mapper.toDto( list );
            return new ResponseEntity<>( new DataDto<>( dtos ) );
        } catch ( BadRequestException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.BAD_REQUEST , e.getMessage() ) ) );
        } catch ( IllegalArgumentException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.INTERNAL_SERVER_ERROR , e.getMessage() ) ) );
        }
    }
}
