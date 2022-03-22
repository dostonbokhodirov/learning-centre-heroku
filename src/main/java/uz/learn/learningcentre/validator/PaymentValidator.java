package uz.learn.learningcentre.validator;


import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.payment.PaymentCreateDto;
import uz.learn.learningcentre.dto.payment.PaymentDto;
import uz.learn.learningcentre.dto.payment.PaymentUpdateDto;
import uz.learn.learningcentre.entity.Payment;
import uz.learn.learningcentre.validator.base.GenericValidator;

@Component
public class PaymentValidator implements GenericValidator<Payment, PaymentDto, PaymentCreateDto, PaymentUpdateDto, Long> {


    @Override
    public void validOnUpdate(PaymentUpdateDto paymentUpdateDto) {

    }

    @Override
    public void validOnCreate(PaymentCreateDto paymentCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
