package uz.learn.learningcentre.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learningcentre.dto.base.BaseDto;
import uz.learn.learningcentre.dto.subject.SubjectCreateDto;
import uz.learn.learningcentre.entity.Subject;
import uz.learn.learningcentre.enums.AuthRole;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserCreateDto implements BaseDto {

    private String fullName;

    private String phoneNumber;

    private String password;

    private List<Long> subjects = Collections.emptyList();

    private AuthRole role;

    private Double salary = (double) 0L;
}
