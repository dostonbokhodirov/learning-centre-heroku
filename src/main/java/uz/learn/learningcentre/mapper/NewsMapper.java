package uz.learn.learningcentre.mapper;

import org.mapstruct.Mapper;
import uz.learn.learningcentre.dto.news.NewsCreateDto;
import uz.learn.learningcentre.dto.news.NewsDto;
import uz.learn.learningcentre.dto.news.NewsUpdateDto;
import uz.learn.learningcentre.entity.News;
import uz.learn.learningcentre.mapper.base.GenericMapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NewsMapper extends GenericMapper<News, NewsDto, NewsCreateDto, NewsUpdateDto> {


    @Override
    News fromDto(NewsDto dto);

    @Override
    List<News> fromDto(List<NewsDto> dtos);

    @Override
    NewsDto toDto(News entity);

    @Override
    List<NewsDto> toDto(List<News> entities);

    @Override
    News fromUpdateDto(NewsUpdateDto newsUpdateDto);

    @Override
    News fromUpdateDto(NewsUpdateDto newsUpdateDto, News news);

    @Override
    List<News> fromUpdateDto(List<NewsUpdateDto> ud);

    @Override
    News fromCreateDto(NewsCreateDto newsCreateDto);

    @Override
    List<News> fromCreateDto(List<NewsCreateDto> cd);
}
