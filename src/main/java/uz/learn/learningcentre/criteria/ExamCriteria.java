package uz.learn.learningcentre.criteria;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learningcentre.criteria.base.AbstractCriteria;

@Getter
@Setter
public class ExamCriteria extends AbstractCriteria {
    private Long groupId;
}