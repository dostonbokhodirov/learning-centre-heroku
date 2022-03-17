package uz.learn.learningcentre.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.geo.Point;
import uz.learn.learningcentre.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
//@Entity
//@Table(schema = "organization", name = "organization")
public class Organization extends Auditable {

    @Column(nullable = false)
    private String name;

    private String logo;

    @Column(nullable = false, unique = true)
    private String registrationNumber;


}
