package uz.learn.learningcentre.service.base;


import lombok.RequiredArgsConstructor;
import uz.learn.learningcentre.repository.base.BaseRepository;
import uz.learn.learningcentre.validator.base.BaseValidator;

@RequiredArgsConstructor
public abstract class AbstractService<M, V extends BaseValidator, R extends BaseRepository> implements BaseService {

    private final M mapper;
    private final V validator;
    private final R repository;


}
