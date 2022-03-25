package uz.learn.learningcentre.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learningcentre.entity.base.Auditable;
import uz.learn.learningcentre.enums.StudyType;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "student", name = "student")
public class Student extends Auditable {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private StudyType studyType; // Grant / Contract / None

    @Column
    private String entranceYear;

    private String mothersNumber;

    private String fathersNumber;

    private boolean student; // student if added to course / if not student not added

}
