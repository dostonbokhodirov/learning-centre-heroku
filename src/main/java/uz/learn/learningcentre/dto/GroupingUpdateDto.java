package uz.learn.learningcentre.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learningcentre.dto.base.GenericDto;
import uz.learn.learningcentre.entity.Student;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupingUpdateDto extends GenericDto {

    private String name;

    private String subject;

    private String mentor;

    private Boolean available;

    private LocalDate closedDate;

    private List<Student> students;

    private Double price;
}
