package uz.learn.learningcentre.validator;

import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.auth.AuthUserCreateDto;
import uz.learn.learningcentre.dto.auth.AuthUserDto;
import uz.learn.learningcentre.dto.auth.AuthUserUpdateDto;
import uz.learn.learningcentre.entity.AuthUser;
import uz.learn.learningcentre.validator.base.GenericValidator;

@Component
public class AuthUserValidator implements GenericValidator<AuthUser, AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto, Long> {

    @Override
    public void validOnUpdate(AuthUserUpdateDto authUserUpdateDto) {

    }

    @Override
    public void validOnCreate(AuthUserCreateDto authUserCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
