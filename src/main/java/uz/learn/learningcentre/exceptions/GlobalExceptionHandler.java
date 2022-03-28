package uz.learn.learningcentre.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import uz.learn.learningcentre.dto.grouping.GroupingDto;
import uz.learn.learningcentre.response.AppErrorDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;

@ControllerAdvice("uz.learn.learningcentre")
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<DataDto<AppErrorDto>> handle500(RuntimeException e, WebRequest webRequest) {
        return new ResponseEntity<>
                (new DataDto<>(new AppErrorDto(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), webRequest)));
    }

    @ExceptionHandler(value = {BadRequestException.class})
    public ResponseEntity<DataDto<AppErrorDto>> handle400(BadRequestException e, WebRequest webRequest) {
        return new ResponseEntity<>
                (new DataDto<>(new AppErrorDto(HttpStatus.BAD_REQUEST, e.getMessage(), webRequest)));
    }

    @ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity<DataDto<AppErrorDto>> handle404(RuntimeException e, WebRequest webRequest) {
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public ResponseEntity<DataDto<GroupingDto>> handle404 (NotFoundException e ){
            return new ResponseEntity<>
                    (new DataDto<>(new AppErrorDto(HttpStatus.NOT_FOUND, e.getMessage(), webRequest)));
        }

    }
