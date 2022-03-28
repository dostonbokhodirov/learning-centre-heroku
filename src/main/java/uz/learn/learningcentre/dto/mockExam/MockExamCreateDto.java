package uz.learn.learningcentre.dto.mockExam;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learningcentre.dto.base.BaseDto;

@Getter
@Setter
public class MockExamCreateDto implements BaseDto {

    /**
     * Bu Mock Exam create bo'lganda home pagega elon chiqishi uchun
     */

    private String name;

    private String date;

    private String location;

    private String begin;

    private String end;


}
