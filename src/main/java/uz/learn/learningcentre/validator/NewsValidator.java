package uz.learn.learningcentre.validator;

import org.springframework.stereotype.Component;
import uz.learn.learningcentre.dto.news.NewsCreateDto;
import uz.learn.learningcentre.dto.news.NewsDto;
import uz.learn.learningcentre.dto.news.NewsUpdateDto;
import uz.learn.learningcentre.entity.News;
import uz.learn.learningcentre.validator.base.GenericValidator;

@Component
public class NewsValidator implements GenericValidator<News, NewsDto, NewsCreateDto, NewsUpdateDto, Long> {

    @Override
    public void validOnUpdate(NewsUpdateDto newsUpdateDto) {

    }

    @Override
    public void validOnCreate(NewsCreateDto newsCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
