package uz.learn.learningcentre.dto.auth;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learningcentre.dto.base.BaseDto;
import uz.learn.learningcentre.entity.Subject;
import uz.learn.learningcentre.enums.AuthRole;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class AuthUserCreateDto implements BaseDto {
    private String fullName;

    private String phoneNumber;

    private String password;

    private List<Subject> subjects = Collections.emptyList();

    private AuthRole role;

    private Double salary = (double) 0L;
}
