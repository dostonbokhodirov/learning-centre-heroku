package uz.learn.learningcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learningcentre.entity.AuthUser;
import uz.learn.learningcentre.repository.base.BaseRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long>, BaseRepository {
}
