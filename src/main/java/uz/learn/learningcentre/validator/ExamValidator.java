package uz.learn.learningcentre.validator;

import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.exam.ExamCreateDto;
import uz.learn.learningcentre.dto.exam.ExamDto;
import uz.learn.learningcentre.dto.exam.ExamUpdateDto;
import uz.learn.learningcentre.entity.Exam;
import uz.learn.learningcentre.validator.base.BaseValidator;
import uz.learn.learningcentre.validator.base.GenericValidator;


@Component
public class ExamValidator implements GenericValidator<Exam, ExamDto, ExamCreateDto, ExamUpdateDto> {

    @Override
    public boolean validOnUpdate(ExamUpdateDto examUpdateDto) {
        return false;
    }

    @Override
    public boolean validOnCreate(ExamCreateDto examCreateDto) {
        return false;
    }
}
