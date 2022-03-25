package uz.learn.learningcentre.criteria.base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public abstract class AbstractCriteria implements BaseCriteria {
    protected Integer size;
    protected Integer page;

//    public AbstractCriteria(Integer size, Integer page) {
//        this.size = size;
//        this.page = page;
//    }
}
