package uz.learn.learningcentre.service;

import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.LessonCriteria;
import uz.learn.learningcentre.dto.lesson.LessonCreateDto;
import uz.learn.learningcentre.dto.lesson.LessonDto;
import uz.learn.learningcentre.dto.lesson.LessonUpdateDto;
import uz.learn.learningcentre.mapper.LessonMapper;
import uz.learn.learningcentre.repository.LessonRepository;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.LessonValidator;

import java.util.List;

@Service
public class LessonService extends AbstractService<LessonMapper, LessonValidator, LessonRepository>
        implements GenericCrudService<LessonDto, LessonCreateDto, LessonUpdateDto>,
        GenericService<LessonDto, LessonCriteria> {


    public LessonService(LessonMapper mapper, LessonValidator validator, LessonRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(LessonCreateDto lessonCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(LessonUpdateDto lessonUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<LessonDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<LessonDto>>> getAll(LessonCriteria criteria) {
        return null;
    }
}
