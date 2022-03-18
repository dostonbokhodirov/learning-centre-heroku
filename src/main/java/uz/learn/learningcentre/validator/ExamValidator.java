package uz.learn.learningcentre.validator;

import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.exam.ExamCreateDto;
import uz.learn.learningcentre.dto.exam.ExamDto;
import uz.learn.learningcentre.dto.exam.ExamUpdateDto;
import uz.learn.learningcentre.entity.Exam;
import uz.learn.learningcentre.validator.base.GenericValidator;


@Component
public class ExamValidator implements GenericValidator<Exam, ExamDto, ExamCreateDto, ExamUpdateDto, Long> {

    @Override
    public void validOnUpdate(ExamUpdateDto examUpdateDto) {

    }

    @Override
    public void validOnCreate(ExamCreateDto examCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
