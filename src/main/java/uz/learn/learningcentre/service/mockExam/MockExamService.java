package uz.learn.learningcentre.service.mockExam;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.ExamCriteria;
import uz.learn.learningcentre.criteria.mockExam.MockExamCriteria;
import uz.learn.learningcentre.dto.mockExam.MockExamCreateDto;
import uz.learn.learningcentre.dto.mockExam.MockExamDto;
import uz.learn.learningcentre.dto.mockExam.MockExamUpdateDto;
import uz.learn.learningcentre.entity.MockExam;
import uz.learn.learningcentre.exceptions.BadRequestException;
import uz.learn.learningcentre.mapper.mockExam.MockExamMapper;
import uz.learn.learningcentre.repository.mockExam.MockExamRepository;
import uz.learn.learningcentre.response.AppErrorDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.mockExam.MockExamValidator;

import java.util.List;

@Service
public class MockExamService extends AbstractService<MockExamMapper, MockExamValidator, MockExamRepository>
        implements GenericCrudService<MockExamDto, MockExamCreateDto, MockExamUpdateDto>,
        GenericService<MockExamDto, MockExamCriteria> {

    public MockExamService(MockExamMapper mapper, MockExamValidator validator, MockExamRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<MockExamDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<MockExamDto>>> getAll(MockExamCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(MockExamCreateDto mockExamCreateDto) {
        try {
            validator.validOnCreate(mockExamCreateDto);
//            repository.updateEnabled();
            MockExam mockExam = mapper.fromCreateDto(mockExamCreateDto);
            MockExam save = repository.save(mockExam);
            return new ResponseEntity<>(new DataDto<>(save.getId()));
        } catch (BadRequestException e) {
            return new ResponseEntity<>
                    (new DataDto<>(new AppErrorDto(HttpStatus.BAD_REQUEST, e.getMessage())));
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>
                    (new DataDto<>(new AppErrorDto(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage())));
        }
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(MockExamUpdateDto mockExamUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }
}
