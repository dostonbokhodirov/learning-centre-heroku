package uz.learn.learningcentre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.dto.exam.ExamCreateDto;
import uz.learn.learningcentre.dto.exam.ExamDto;
import uz.learn.learningcentre.dto.exam.ExamUpdateDto;
import uz.learn.learningcentre.enums.AuthRole;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.ExamService;

import java.util.List;

@RestController
public class ExamController extends AbstractController<ExamService>
        implements GenericCrudController<ExamCreateDto, ExamUpdateDto>, GenericController<ExamDto> {


    public ExamController(ExamService service) {
        super(service);
    }

    @Override
    @RequestMapping(name = "",method = RequestMethod.GET)
    public ResponseEntity<DataDto<ExamDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<ExamDto>>> getAll() {
        return null;
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
}
