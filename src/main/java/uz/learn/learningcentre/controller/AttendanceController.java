package uz.learn.learningcentre.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.criteria.AttendanceCriteria;
import uz.learn.learningcentre.criteria.base.BaseCriteria;
import uz.learn.learningcentre.dto.attendance.AttendanceCreateDto;
import uz.learn.learningcentre.dto.attendance.AttendanceDto;
import uz.learn.learningcentre.dto.attendance.AttendanceUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.AttendanceService;

import java.util.List;

@RestController
@RequestMapping(value = "/attendance/")
public class AttendanceController extends AbstractController<AttendanceService>
        implements GenericCrudController<AttendanceCreateDto, AttendanceUpdateDto>,
        GenericController<AttendanceDto, AttendanceCriteria> {


    public AttendanceController(AttendanceService service) {
        super(service);
    }

    @Override
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<AttendanceDto>> get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @Override
    @RequestMapping(value = "list/", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<AttendanceDto>>> getAll(AttendanceCriteria criteria) {
        return service.getAll(criteria);
    }

    @RequestMapping(value = "list/{teacherId}{groupId}", method = RequestMethod.GET)
    public ResponseEntity<DataDto<List<AttendanceDto>>> getOneGroupAttendance(@PathVariable("teacherId") Long teacherId, @PathVariable("groupId") Long groupId) {
        return service.getOneGroupAttendance(teacherId, groupId);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(AttendanceCreateDto attendanceCreateDto) {
        return service.create(attendanceCreateDto);
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(AttendanceUpdateDto attendanceUpdateDto) {
        return service.update(attendanceUpdateDto);
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return service.delete(id);
    }
}
