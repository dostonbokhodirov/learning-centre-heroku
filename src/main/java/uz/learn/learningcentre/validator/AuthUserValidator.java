package uz.learn.learningcentre.validator;

import uz.learn.learningcentre.dto.auth.AuthUserCreateDto;
import uz.learn.learningcentre.dto.auth.AuthUserDto;
import uz.learn.learningcentre.dto.auth.AuthUserUpdateDto;
import uz.learn.learningcentre.entity.AuthUser;
import uz.learn.learningcentre.validator.base.BaseValidator;

public class AuthUserValidator implements BaseValidator<AuthUser, AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto> {

    @Override
    public boolean validOnUpdate(AuthUserUpdateDto authUserUpdateDto) {
        return false;
    }

    @Override
    public boolean validOnCreate(AuthUserCreateDto authUserCreateDto) {
        return false;
    }
}
