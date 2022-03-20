package uz.learn.learningcentre.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.GroupingCreateDto;
import uz.learn.learningcentre.dto.GroupingDto;
import uz.learn.learningcentre.dto.GroupingUpdateDto;
import uz.learn.learningcentre.entity.Grouping;
import uz.learn.learningcentre.mapper.base.GenericMapper;
import uz.learn.learningcentre.validator.base.BaseValidator;

import java.util.List;

@Component
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface GroupingMapper extends GenericMapper<
        Grouping,
        GroupingDto,
        GroupingCreateDto,
        GroupingUpdateDto>, BaseValidator {

    @Override
    Grouping fromDto( GroupingDto dto );

    @Override
    List<Grouping> fromDto( List<GroupingDto> dtos );

    @Override
    GroupingDto toDto( Grouping entity );

    @Override
    List<GroupingDto> toDto( List<Grouping> entities );

    @Override
    Grouping fromUpdateDto( GroupingUpdateDto groupingUpdateDto );

    @Override
    List<Grouping> fromUpdateDto( List<GroupingUpdateDto> ud );

    @Override
    Grouping fromUpdateDto( GroupingUpdateDto groupingUpdateDto ,@MappingTarget Grouping grouping );

    @Override
    Grouping fromCreateDto( GroupingCreateDto groupingCreateDto );

    @Override
    List<Grouping> fromCreateDto( List<GroupingCreateDto> cd );
}
