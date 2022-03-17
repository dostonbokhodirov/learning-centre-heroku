package uz.learn.learningcentre.service.base;

import uz.learn.learningcentre.dto.base.BaseDto;
import uz.learn.learningcentre.dto.base.GenericDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;

import java.util.List;

public interface GenericService<D extends GenericDto> {

    ResponseEntity<DataDto<D>> get(Long id);

    ResponseEntity<DataDto<List<D>>> getAll();


}
