package uz.learn.learningcentre.validator;

import uz.learn.learningcentre.dto.attendance.AttendanceCreateDto;
import uz.learn.learningcentre.dto.attendance.AttendanceDto;
import uz.learn.learningcentre.dto.attendance.AttendanceUpdateDto;
import uz.learn.learningcentre.entity.Attendance;
import uz.learn.learningcentre.validator.base.GenericValidator;

public class AttendanceValidator implements GenericValidator<Attendance, AttendanceDto, AttendanceCreateDto, AttendanceUpdateDto, Long> {
    @Override
    public void validOnUpdate(AttendanceUpdateDto attendanceUpdateDto) {

    }

    @Override
    public void validOnCreate(AttendanceCreateDto attendanceCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
