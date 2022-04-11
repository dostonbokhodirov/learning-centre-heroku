package uz.learn.learningcentre.service.grouping;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.grouping.GroupingCriteria;
import uz.learn.learningcentre.dto.grouping.GroupingCreateDto;
import uz.learn.learningcentre.dto.grouping.GroupingDto;
import uz.learn.learningcentre.dto.grouping.GroupingUpdateDto;
import uz.learn.learningcentre.entity.Grouping;
import uz.learn.learningcentre.exceptions.NotFoundException;
import uz.learn.learningcentre.mapper.grouping.GroupingMapper;
import uz.learn.learningcentre.repository.grouping.GroupingRepository;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.grouping.GroupingValidator;

import java.util.List;
import java.util.Optional;

@Service
public class GroupingService extends AbstractService<GroupingMapper, GroupingValidator, GroupingRepository>
        implements GenericCrudService<GroupingDto, GroupingCreateDto, GroupingUpdateDto>,
        GenericService<GroupingDto, GroupingCriteria> {


    public GroupingService(GroupingMapper mapper, GroupingValidator validator, GroupingRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(GroupingCreateDto groupingCreateDto) {
        validator.validOnCreate(groupingCreateDto);
        Grouping grouping = mapper.fromCreateDto(groupingCreateDto);
        grouping.setSubjectId(groupingCreateDto.getSubject());
        grouping.setMentorId(groupingCreateDto.getMentor());
        Grouping save = repository.save(grouping);
        return new ResponseEntity<>(new DataDto<>(save.getId()));
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(GroupingUpdateDto groupingUpdateDto) {
        validator.validOnUpdate(groupingUpdateDto);
        Optional<Grouping> optional = repository.findByIdWithoutStudent(groupingUpdateDto.getId());
        if (optional.isPresent()) {
            Grouping grouping = mapper.fromUpdateDto(groupingUpdateDto, optional.get());
            Grouping save = repository.save(grouping);
            return new ResponseEntity<>(new DataDto<>(save.getId()));
        }
        throw new NotFoundException("Group not found");

    }

    public ResponseEntity<DataDto<Boolean>> setStudent(Long groupId, Long studentId) {
        repository.setStudent(studentId, groupId);
        return new ResponseEntity<>(new DataDto<>(true));
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        validator.validOnId(id);
        Optional<Grouping> byId = repository.findById(id);
        byId.ifPresent(repository::delete);
        return new ResponseEntity<>(new DataDto<>(true));
    }

    @Override
    public ResponseEntity<DataDto<GroupingDto>> get(Long id) {
//        try {
        validator.validOnId(id);
        Optional<Grouping> optional = repository.findById(id);
        if (optional.isPresent()) {
            GroupingDto groupingDto = mapper.toDto(optional.get());
            return new ResponseEntity<>(new DataDto<>(groupingDto));
        }
        throw new NotFoundException("GROUP_NOT_FOUND");

        /*} catch ( NotFoundException e ) {
            return new ResponseEntity<>
                    ( new DataDto<>( new AppErrorDto( HttpStatus.NOT_FOUND , e.getMessage() ) ) );

        }*/
    }

    @Override
    public ResponseEntity<DataDto<List<GroupingDto>>> getAll(GroupingCriteria criteria) {
        Pageable pageable = PageRequest.of(criteria.getPage(), criteria.getSize(), Sort.by("price").descending());
        List<Grouping> groupingList = repository.findAll(pageable).getContent();
        List<GroupingDto> groupingDtoList = mapper.toDto(groupingList);
        return new ResponseEntity<>(new DataDto<>(groupingDtoList));
    }
}
