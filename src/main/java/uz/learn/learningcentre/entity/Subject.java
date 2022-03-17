package uz.learn.learningcentre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learningcentre.entity.base.Auditable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(schema = "subject", name = "subject")
public class Subject extends Auditable {

    @Column(nullable = false)
    private String name;





}
