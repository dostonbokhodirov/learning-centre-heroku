package uz.learn.learningcentre.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.criteria.AuthUserCriteria;
import uz.learn.learningcentre.dto.auth.AuthUserCreateDto;
import uz.learn.learningcentre.dto.auth.AuthUserDto;
import uz.learn.learningcentre.dto.auth.AuthUserUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.AuthUserService;

import java.util.List;


@RestController
public class AuthUserController extends AbstractController<AuthUserService>
        implements GenericCrudController<AuthUserCreateDto, AuthUserUpdateDto>,
        GenericController<AuthUserDto, AuthUserCriteria> {


    public AuthUserController(AuthUserService service) {
        super(service);
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(@RequestBody AuthUserCreateDto authUserCreateDto) {
        return service.create(authUserCreateDto);
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(AuthUserUpdateDto authUserUpdateDto) {
        return service.update(authUserUpdateDto);
    }

    @Override
    @RequestMapping(value = "/{id}")
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable(value = "id") Long id) {
        return service.delete(id);
    }

    @Override
    public ResponseEntity<DataDto<AuthUserDto>> get(@PathVariable(value = "id") Long id) {
        return service.get(id);
    }

    @Override
    public ResponseEntity<DataDto<List<AuthUserDto>>> getAll(AuthUserCriteria criteria) {
        return service.getAll(criteria);
    }
}
