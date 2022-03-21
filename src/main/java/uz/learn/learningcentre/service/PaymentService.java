package uz.learn.learningcentre.service;

import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.base.AbstractCriteria;
import uz.learn.learningcentre.dto.payment.PaymentCreateDto;
import uz.learn.learningcentre.dto.payment.PaymentDto;
import uz.learn.learningcentre.dto.payment.PaymentUpdateDto;
import uz.learn.learningcentre.mapper.PaymentMapper;
import uz.learn.learningcentre.repository.PaymentRepository;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.PaymentValidator;

import java.util.List;

@Service
public class PaymentService extends AbstractService<PaymentMapper, PaymentValidator, PaymentRepository>
        implements GenericCrudService<PaymentDto, PaymentCreateDto, PaymentUpdateDto>,
        GenericService<PaymentDto, AbstractCriteria> {


    public PaymentService(PaymentMapper mapper, PaymentValidator validator, PaymentRepository repository) {
        super(mapper, validator, repository);
    }

    @Override
    public ResponseEntity<DataDto<Long>> create(PaymentCreateDto paymentCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(PaymentUpdateDto paymentUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<PaymentDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<PaymentDto>>> getAll(AbstractCriteria criteria) {
        return null;
    }
}
