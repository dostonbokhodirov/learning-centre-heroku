package uz.learn.learningcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.learn.learningcentre.entity.Payment;
import uz.learn.learningcentre.repository.base.BaseRepository;

public interface PaymentMockRepository extends JpaRepository<Payment, Long>, BaseRepository {

}
