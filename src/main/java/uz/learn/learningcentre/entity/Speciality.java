package uz.learn.learningcentre.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(schema = "exam", name = "speciality")
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "mock_exam_speciality")
    private MockExam mockExam;

    private Long subjectId;

    private Short answerCount;

    private boolean main;// asosiy or not


}
