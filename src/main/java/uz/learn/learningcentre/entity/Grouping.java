package uz.learn.learningcentre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learningcentre.entity.base.Auditable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "group", name = "group")
public class Grouping extends Auditable {

    @Column
    private String name;

    @Column
    private Long subjectId;

    @Column
    private Long mentorId;

    @Column
    private LocalDate closedDate; // group tugatilgan sanasi

    @ManyToMany
    @JoinTable(
            name = "student_group",
            schema = "student",
            joinColumns = {@JoinColumn(name = "group_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    private List<Student> students;


    @Column(nullable = false)
    private Double price;
}
