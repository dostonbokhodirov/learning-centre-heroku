package uz.learn.learningcentre.dto.attendance;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uz.learn.learningcentre.dto.base.GenericDto;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
@Setter
public class AttendanceDto extends GenericDto {

    private Long studentId;

    private Long groupId;

    private Boolean here;// null if here / true if reasonable / false if reason not found(send message)

    private LocalDateTime createdAt;

}
