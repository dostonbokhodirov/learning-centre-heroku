package uz.learn.learningcentre.controller.mockExam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.criteria.mockExam.MockExamCriteria;
import uz.learn.learningcentre.dto.mockExam.MockExamCreateDto;
import uz.learn.learningcentre.dto.mockExam.MockExamDto;
import uz.learn.learningcentre.dto.mockExam.MockExamUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.mockExam.MockExamService;

import java.util.List;

@RestController
@RequestMapping("/mock-exam/")
public class MockExamController extends AbstractController<MockExamService>
        implements GenericCrudController<MockExamCreateDto, MockExamUpdateDto>,
        GenericController<MockExamDto, MockExamCriteria> {

    public MockExamController(MockExamService service) {
        super(service);
    }

    @Override
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> create(MockExamCreateDto mockExamCreateDto) {
        return service.create(mockExamCreateDto);
    }

    @RequestMapping(value = "add-student/{studentId}", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> addStudent(@PathVariable("studentId") Long studentId) {
        return null;
    }

    @Override
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Long>> update(MockExamUpdateDto mockExamUpdateDto) {
        return service.update(mockExamUpdateDto);
    }

    @Override
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable(value = "id") Long id) {
        return service.delete(id);
    }

    @Override
    @RequestMapping(value = "get/{id}", method = RequestMethod.POST)
    public ResponseEntity<DataDto<MockExamDto>> get(@PathVariable(value = "id") Long id) {
        return service.get(id);
    }

    @Override
    public ResponseEntity<DataDto<List<MockExamDto>>> getAll(MockExamCriteria criteria) {
        return null;
    }
}
