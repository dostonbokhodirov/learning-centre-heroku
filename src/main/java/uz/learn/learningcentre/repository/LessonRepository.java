package uz.learn.learningcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learningcentre.entity.Lesson;
import uz.learn.learningcentre.repository.base.BaseRepository;


public interface LessonRepository extends JpaRepository<Lesson, Long>, BaseRepository {
}
