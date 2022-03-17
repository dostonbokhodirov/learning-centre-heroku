package uz.learn.learningcentre.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.dto.auth.AuthUserCreateDto;
import uz.learn.learningcentre.dto.auth.AuthUserDto;
import uz.learn.learningcentre.dto.auth.AuthUserUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.AuthUserService;

import java.util.List;


@RestController
public class AuthController extends AbstractController<AuthUserService>
        implements GenericCrudController<AuthUserCreateDto, AuthUserUpdateDto>,
        GenericController<AuthUserDto> {


    public AuthController(AuthUserService service) {
        super(service);
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(AuthUserCreateDto authUserCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(AuthUserUpdateDto authUserUpdateDto) {
        return null;
    }

    @Override
    @RequestMapping(value = "/{id}")
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable("id") Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<AuthUserDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<AuthUserDto>>> getAll() {
        return null;
    }
}
