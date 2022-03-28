package uz.learn.learningcentre.validator.mockExam;

import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.base.BaseDto;
import uz.learn.learningcentre.dto.base.GenericDto;
import uz.learn.learningcentre.dto.mockExam.MockExamCreateDto;
import uz.learn.learningcentre.dto.mockExam.MockExamDto;
import uz.learn.learningcentre.dto.mockExam.MockExamUpdateDto;
import uz.learn.learningcentre.entity.MockExam;
import uz.learn.learningcentre.exceptions.BadRequestException;
import uz.learn.learningcentre.validator.base.GenericValidator;

import java.io.Serializable;
import java.util.Objects;

@Component
public class MockExamValidator implements
        GenericValidator<MockExam, MockExamDto, MockExamCreateDto, MockExamUpdateDto, Long> {

    @Override
    public void validOnUpdate(MockExamUpdateDto mockExamUpdateDto) {

    }

    @Override
    public void validOnCreate(MockExamCreateDto mockExamCreateDto) {
        if (Objects.isNull(mockExamCreateDto.getName())) {
            throw new BadRequestException("NAME IS NULL");
        }
        if (Objects.isNull(mockExamCreateDto.getDate())) {
            throw new BadRequestException("DATE IS NULL");
        }
        if (Objects.isNull(mockExamCreateDto.getBegin())) {
            throw new BadRequestException("BEGIN TIME IS NULL");
        }
        if (Objects.isNull(mockExamCreateDto.getEnd())) {
            throw new BadRequestException("END TIME IS NULL");
        }
        if (Objects.isNull(mockExamCreateDto.getLocation())) {
            throw new BadRequestException("LOCATION IS NULL");
        }
    }

    @Override
    public void validOnId(Long id) {

    }
}
