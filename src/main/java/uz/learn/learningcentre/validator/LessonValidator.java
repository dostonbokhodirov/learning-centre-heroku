package uz.learn.learningcentre.validator;

import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.lesson.LessonCreateDto;
import uz.learn.learningcentre.dto.lesson.LessonDto;
import uz.learn.learningcentre.dto.lesson.LessonUpdateDto;
import uz.learn.learningcentre.entity.Lesson;
import uz.learn.learningcentre.validator.base.GenericValidator;


@Component
public class LessonValidator implements GenericValidator<Lesson, LessonDto, LessonCreateDto, LessonUpdateDto, Long> {

    @Override
    public void validOnUpdate(LessonUpdateDto lessonUpdateDto) {

    }

    @Override
    public void validOnCreate(LessonCreateDto lessonCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
