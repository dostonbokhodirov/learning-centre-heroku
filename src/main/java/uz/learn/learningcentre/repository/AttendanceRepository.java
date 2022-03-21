package uz.learn.learningcentre.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.learn.learningcentre.entity.Attendance;
import uz.learn.learningcentre.repository.base.BaseRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long>, BaseRepository {


    @Query(value = "select * from attendance.attendance where created_by = :teacherId and group_id = :groupId ", nativeQuery = true)
    List<Attendance> findAttendanceByTeacherId(Long teacherId, Long groupId);

}
