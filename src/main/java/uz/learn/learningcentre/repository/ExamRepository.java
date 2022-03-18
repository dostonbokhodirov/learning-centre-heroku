package uz.learn.learningcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learningcentre.entity.Exam;
import uz.learn.learningcentre.mapper.base.BaseMapper;
import uz.learn.learningcentre.repository.base.BaseRepository;

public interface ExamRepository extends JpaRepository<Exam,Long>, BaseRepository {
}
