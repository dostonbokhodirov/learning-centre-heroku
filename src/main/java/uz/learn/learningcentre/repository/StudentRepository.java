package uz.learn.learningcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learningcentre.entity.Student;
import uz.learn.learningcentre.repository.base.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long>, BaseRepository {

    Optional<List<Student>> findAllByEntranceYearAndStudyTypeGrant(String year);
}
