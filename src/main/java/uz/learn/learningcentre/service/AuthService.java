package uz.learn.learningcentre.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import uz.learn.learningcentre.service.base.BaseService;

public class AuthService implements UserDetailsService, BaseService {

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
