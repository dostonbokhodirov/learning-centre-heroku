package uz.learn.learningcentre.entity;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;
import uz.learn.learningcentre.entity.base.Auditable;
import uz.learn.learningcentre.enums.StudyType;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "auth", name = "student")
public class Student extends Auditable {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private StudyType studyType; // Grant / Contract / None
    
    private String mothersNumber;

    private String fathersNumber;

}