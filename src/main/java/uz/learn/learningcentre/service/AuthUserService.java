package uz.learn.learningcentre.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.AuthUserCriteria;
import uz.learn.learningcentre.dto.auth.AuthUserCreateDto;
import uz.learn.learningcentre.dto.auth.AuthUserDto;
import uz.learn.learningcentre.dto.auth.AuthUserUpdateDto;
import uz.learn.learningcentre.entity.AuthUser;
import uz.learn.learningcentre.exceptions.BadRequestException;
import uz.learn.learningcentre.mapper.AuthUserMapper;
import uz.learn.learningcentre.repository.AuthUserRepository;
import uz.learn.learningcentre.response.AppErrorDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.AuthUserValidator;

import java.util.List;
import java.util.Optional;

@Service
public class AuthUserService extends AbstractService<AuthUserMapper, AuthUserValidator, AuthUserRepository>
        implements GenericCrudService<AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto>,
        GenericService<AuthUserDto, AuthUserCriteria> {


    public AuthUserService(AuthUserMapper mapper, AuthUserValidator validator, AuthUserRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(AuthUserCreateDto authUserCreateDto) {
        try {
            validator.validOnCreate(authUserCreateDto);
            AuthUser authUser = mapper.fromCreateDto(authUserCreateDto);
            AuthUser save = repository.save(authUser);
            return new ResponseEntity<>(new DataDto<>(save.getId()));
        } catch (BadRequestException e) {
            return new ResponseEntity<>
                    (new DataDto<>(new AppErrorDto(HttpStatus.BAD_REQUEST, e.getMessage())));
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>
                    (new DataDto<>(new AppErrorDto(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage())));
        }
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(AuthUserUpdateDto authUserUpdateDto) {
        return null;

    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<AuthUserDto>> get(Long id) {
        try {
            validator.validOnId(id);
        } catch (BadRequestException e) {
            return new ResponseEntity<>(new DataDto<>
                    (new AppErrorDto(HttpStatus.BAD_REQUEST, e.getMessage())));
        }
        Optional<AuthUser> authUser = repository.findById(id);
        if (authUser.isPresent()) {
            AuthUserDto authUserDto = mapper.toDto(authUser.get());
            return new ResponseEntity<>(new DataDto<>(authUserDto));
        } else {
            return new ResponseEntity<>(new DataDto<>
                    (new AppErrorDto(HttpStatus.NOT_FOUND, "AUTH USER NOT FOUND")));
        }
    }

    @Override
    public ResponseEntity<DataDto<List<AuthUserDto>>> getAll(AuthUserCriteria criteria) {
        return null;
    }

}
