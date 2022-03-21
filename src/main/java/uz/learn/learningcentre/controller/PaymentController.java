package uz.learn.learningcentre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.criteria.base.AbstractCriteria;
import uz.learn.learningcentre.dto.payment.PaymentCreateDto;
import uz.learn.learningcentre.dto.payment.PaymentDto;
import uz.learn.learningcentre.dto.payment.PaymentUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.PaymentService;

import java.util.List;

@Controller
@RequestMapping(value = "/payment/")
public class PaymentController extends AbstractController<PaymentService>
        implements GenericCrudController<PaymentCreateDto, PaymentUpdateDto>,
        GenericController<PaymentDto, AbstractCriteria> {


    public PaymentController(PaymentService service) {
        super(service);
    }

    @Override
    @GetMapping(value = "get/{id}")
    public ResponseEntity<DataDto<PaymentDto>> get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @Override
    @GetMapping(value = "list/")
    public ResponseEntity<DataDto<List<PaymentDto>>> getAll(AbstractCriteria criteria) {
        return service.getAll(criteria);
    }

    @Override
    @PostMapping(value = "create/")
    public ResponseEntity<DataDto<Long>> create(@RequestBody PaymentCreateDto paymentCreateDto) {
        return service.create(paymentCreateDto);
    }

    @Override
    @PutMapping(value = "update/")
    public ResponseEntity<DataDto<Long>> update(@RequestBody PaymentUpdateDto paymentUpdateDto) {
        return service.update(paymentUpdateDto);
    }

    @Override
    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<DataDto<Boolean>> delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
