package uz.learn.learningcentre.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.dto.auth.AuthUserCreateDto;
import uz.learn.learningcentre.dto.auth.AuthUserDto;
import uz.learn.learningcentre.dto.auth.AuthUserUpdateDto;
import uz.learn.learningcentre.entity.AuthUser;
import uz.learn.learningcentre.mapper.AuthUserMapper;
import uz.learn.learningcentre.repository.AuthUserRepository;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.AuthUserValidator;

import java.util.List;

@Service
public class AuthUserService extends AbstractService<AuthUserMapper, AuthUserValidator, AuthUserRepository>
        implements UserDetailsService, GenericCrudService<AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto>,
        GenericService<AuthUserDto> {


    public AuthUserService(AuthUserMapper mapper, AuthUserValidator validator, AuthUserRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(AuthUserCreateDto authUserCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(AuthUserUpdateDto authUserUpdateDto) {
        return null;

    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<AuthUserDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<AuthUserDto>>> getAll() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        AuthUser user = repository.findByUsername(username).orElseThrow(() -> {
//            throw new UsernameNotFoundException("User not found");
//        });
//        return User.builder()
//                .username(user.getFullName())
//                .password(user.getPassword())
//                .authorities(user.getAuthority()
//                )
//                .accountLocked(false)
//                .accountExpired(false)
//                .disabled(false)
//                .credentialsExpired(false)
//                .build();
        return null;
    }
}
