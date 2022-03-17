package uz.learn.learningcentre.mapper.base;

import java.util.List;

public interface BaseMapper<E, D, CD, UD> {

    E fromDto(D dto);

    List<E> fromDto(List<D> dtos);

    D toDto(E entity);

    List<D> toDto(List<E> entities);

    E fromUpdateDto(UD ud);

    List<E> fromUpdateDto(List<UD> ud);

    E fromCreateDto(CD cd);

    List<E> fromCreateDto(List<CD> cd);

}
