package uz.learn.learningcentre.service;

import org.springframework.stereotype.Service;
import uz.learn.learningcentre.criteria.PaymentMockCriteria;
import uz.learn.learningcentre.dto.paymentMock.PaymentMockCreateDto;
import uz.learn.learningcentre.dto.paymentMock.PaymentMockDto;
import uz.learn.learningcentre.dto.paymentMock.PaymentMockUpdateDto;
import uz.learn.learningcentre.mapper.PaymentMockMapper;
import uz.learn.learningcentre.repository.PaymentMockRepository;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.base.AbstractService;
import uz.learn.learningcentre.service.base.GenericCrudService;
import uz.learn.learningcentre.service.base.GenericService;
import uz.learn.learningcentre.validator.PaymentMockValidator;

import java.util.List;

@Service
public class PaymentMockService extends AbstractService<PaymentMockMapper, PaymentMockValidator, PaymentMockRepository>
        implements GenericCrudService<PaymentMockDto, PaymentMockCreateDto, PaymentMockUpdateDto>,
        GenericService<PaymentMockDto, PaymentMockCriteria> {

    public PaymentMockService(PaymentMockMapper mapper, PaymentMockValidator validator, PaymentMockRepository repository) {
        super(mapper, validator, repository);
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

    @Override
    public ResponseEntity<DataDto<PaymentMockDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<PaymentMockDto>>> getAll(PaymentMockCriteria criteria) {
        return null;
    }
}
