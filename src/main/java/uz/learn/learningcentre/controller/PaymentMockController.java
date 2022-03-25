package uz.learn.learningcentre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.criteria.PaymentMockCriteria;
import uz.learn.learningcentre.dto.paymentMock.PaymentMockCreateDto;
import uz.learn.learningcentre.dto.paymentMock.PaymentMockDto;
import uz.learn.learningcentre.dto.paymentMock.PaymentMockUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.PaymentMockService;

import java.util.List;

@RestController
@RequestMapping(value = "/payment-mock/")
public class PaymentMockController extends AbstractController<PaymentMockService>
        implements GenericCrudController<PaymentMockCreateDto, PaymentMockUpdateDto>,
        GenericController<PaymentMockDto, PaymentMockCriteria> {


    public PaymentMockController(PaymentMockService service) {
        super(service);
    }

    @Override
    public ResponseEntity<DataDto<PaymentMockDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<PaymentMockDto>>> getAll(PaymentMockCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(PaymentMockCreateDto paymentMockCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(PaymentMockUpdateDto paymentMockUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }
}
