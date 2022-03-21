package uz.learn.learningcentre.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.AttendanceCriteria;
import uz.learn.learningcentre.dto.attendance.AttendanceCreateDto;
import uz.learn.learningcentre.dto.attendance.AttendanceDto;
import uz.learn.learningcentre.dto.attendance.AttendanceUpdateDto;
import uz.learn.learningcentre.entity.Attendance;
import uz.learn.learningcentre.exceptions.BadRequestException;
import uz.learn.learningcentre.mapper.AttendanceMapper;
import uz.learn.learningcentre.repository.AttendanceRepository;
import uz.learn.learningcentre.response.AppErrorDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.AttendanceValidator;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService extends AbstractService<AttendanceMapper, AttendanceValidator, AttendanceRepository>
        implements GenericCrudService<AttendanceDto, AttendanceCreateDto, AttendanceUpdateDto>,
        GenericService<AttendanceDto, AttendanceCriteria> {


    public AttendanceService(AttendanceMapper mapper, AttendanceValidator validator, AttendanceRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(AttendanceCreateDto attendanceCreateDto) {
        validator.validOnCreate(attendanceCreateDto);
        Attendance attendance = repository.save(mapper.fromCreateDto(attendanceCreateDto));
        return new ResponseEntity<>(new DataDto<>(attendance.getId()));
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(AttendanceUpdateDto attendanceUpdateDto) {
        validator.validOnUpdate(attendanceUpdateDto);
        Attendance attendance = repository.save(mapper.fromUpdateDto(attendanceUpdateDto));
        return new ResponseEntity<>(new DataDto<>(attendance.getId()));
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        try {
            validator.validOnId(id);
            repository.deleteById(id);
            return new ResponseEntity<>(new DataDto<>(true), HttpStatus.OK);
        } catch (BadRequestException e) {
            return new ResponseEntity<>(new DataDto<>(new AppErrorDto(HttpStatus.BAD_REQUEST, e.getMessage())));
        }

    }

    @Override
    public ResponseEntity<DataDto<AttendanceDto>> get(Long id) {
        try {
            validator.validOnId(id);

            Optional<Attendance> attendance = repository.findById(id);
            if (attendance.isEmpty()) {
                return new ResponseEntity<>(new DataDto<>(new AppErrorDto(HttpStatus.NOT_FOUND, "Attendance not found")));
            }

            AttendanceDto attendanceDto = mapper.toDto(attendance.get());
            return new ResponseEntity<>(new DataDto<>(attendanceDto));

        } catch (BadRequestException e) {
            return new ResponseEntity<>(new DataDto<>(new AppErrorDto(HttpStatus.BAD_REQUEST, e.getMessage())));
        }

    }

    @Override
    public ResponseEntity<DataDto<List<AttendanceDto>>> getAll(AttendanceCriteria criteria) {

        return null;
    }


    //show one group attendance by groupId and teacherId
    public ResponseEntity<DataDto<List<AttendanceDto>>> getOneGroupAttendance(Long teacherId, Long groupId) {
        List<AttendanceDto> attendanceDtos = mapper.toDto(repository.findAttendanceByTeacherId(teacherId, groupId));
        return new ResponseEntity<>(new DataDto<>(attendanceDtos));
    }

}
