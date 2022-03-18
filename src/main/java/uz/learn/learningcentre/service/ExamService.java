package uz.learn.learningcentre.service;

import org.springframework.stereotype.Service;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.dto.exam.ExamCreateDto;
import uz.learn.learningcentre.dto.exam.ExamDto;
import uz.learn.learningcentre.dto.exam.ExamUpdateDto;
import uz.learn.learningcentre.mapper.ExamMapper;
import uz.learn.learningcentre.repository.ExamRepository;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.ExamValidator;

import java.util.List;

@Service
public class ExamService extends AbstractService<ExamMapper, ExamValidator, ExamRepository>
        implements GenericCrudService<ExamDto, ExamCreateDto, ExamUpdateDto>,
        GenericService<ExamDto> {


    public ExamService(ExamMapper mapper, ExamValidator validator, ExamRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(ExamCreateDto examCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(ExamUpdateDto examUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<ExamDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<ExamDto>>> getAll() {
        return null;
    }
}
