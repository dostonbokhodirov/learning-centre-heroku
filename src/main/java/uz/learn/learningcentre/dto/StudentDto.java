package uz.learn.learningcentre.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learningcentre.dto.base.GenericDto;
import uz.learn.learningcentre.enums.StudyType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto extends GenericDto {

    private String fullName;

    private String phoneNumber;

    private StudyType studyType; // Grant / Contract / None

    private String entranceYear;

    private String mothersNumber;

    private String fathersNumber;
}
