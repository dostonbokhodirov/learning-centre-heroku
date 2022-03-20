package uz.learn.learningcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.learn.learningcentre.entity.Grouping;
import uz.learn.learningcentre.mapper.base.BaseMapper;
import uz.learn.learningcentre.repository.base.BaseRepository;

@Repository
public interface GroupingRepository extends JpaRepository<Grouping, Long>, BaseRepository, BaseMapper {
}
