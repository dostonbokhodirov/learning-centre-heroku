package uz.learn.learningcentre.criteria.authUser;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learningcentre.criteria.base.AbstractCriteria;
import uz.learn.learningcentre.exceptions.enums.AuthRole;

@Getter
@Setter
public class AuthUserCriteria extends AbstractCriteria {

    private AuthRole role;

//    public AuthUserCriteria(Integer size, Integer page) {
//        super(size, page);
//    }
}
