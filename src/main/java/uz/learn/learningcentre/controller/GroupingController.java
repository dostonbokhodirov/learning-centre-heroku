package uz.learn.learningcentre.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.controller.base.GenericController;
import uz.learn.learningcentre.controller.base.GenericCrudController;
import uz.learn.learningcentre.criteria.GroupingCriteria;
import uz.learn.learningcentre.dto.GroupingCreateDto;
import uz.learn.learningcentre.dto.GroupingDto;
import uz.learn.learningcentre.dto.GroupingUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.GroupingService;

import java.util.List;

@RestController
@RequestMapping( "/grouping/*" )
public class GroupingController extends AbstractController<GroupingService>
        implements GenericCrudController<GroupingCreateDto, GroupingUpdateDto>, GenericController<GroupingDto, GroupingCriteria> {

    @Autowired
    public GroupingController( GroupingService service ) {
        super( service );
    }


    @Override
    public ResponseEntity<DataDto<Long>> create( GroupingCreateDto groupingCreateDto ) {
        return service.create( groupingCreateDto );
    }

    @Override
    public ResponseEntity<DataDto<Long>> update( GroupingUpdateDto groupingUpdateDto ) {
        return service.update( groupingUpdateDto );
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete( Long id ) {
        return service.delete( id );
    }


    @Override
    public ResponseEntity<DataDto<GroupingDto>> get( Long id ) {
        return service.get( id );
    }

    @Override
    public ResponseEntity<DataDto<List<GroupingDto>>> getAll( GroupingCriteria criteria ) {
        return service.getAll( criteria );
    }
}
