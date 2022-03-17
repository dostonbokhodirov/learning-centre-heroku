package uz.learn.learningcentre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learningcentre.entity.base.Auditable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(schema = "exam",name = "exam")
public class Exam extends Auditable {


    private Integer ball;

    private String description;// qanaqa imtihonligi

    private Long groupId;

    private Long studentId;



}
