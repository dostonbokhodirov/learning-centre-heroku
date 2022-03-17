package uz.learn.learningcentre.validator.base;

import uz.learn.learningcentre.dto.base.BaseDto;
import uz.learn.learningcentre.dto.base.GenericDto;
import uz.learn.learningcentre.entity.base.BaseEntity;

public interface BaseValidator<
        E extends BaseEntity,
        D extends GenericDto,
        CD extends BaseDto,
        UD extends GenericDto> {


    boolean validOnUpdate(UD ud);

    boolean validOnCreate(CD cd);



}
