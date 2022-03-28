package uz.learn.learningcentre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import uz.learn.learningcentre.controller.base.AbstractController;
import uz.learn.learningcentre.dto.pictures.PictureCreateDto;
import uz.learn.learningcentre.dto.pictures.PictureUpdateDto;
import uz.learn.learningcentre.response.DataDto;
import uz.learn.learningcentre.response.ResponseEntity;
import uz.learn.learningcentre.service.file.FileUploadService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(value = "/picture/")
public class PictureController extends AbstractController<FileUploadService> {

    @Autowired
    public PictureController( FileUploadService service ) {
        super( service );
    }

    @PostMapping(value = "create/")
    public ResponseEntity<DataDto<Long>> create(@RequestBody MultipartFile file){
        PictureCreateDto dto=new PictureCreateDto( file );
        return service.create(dto);
    }

    @PostMapping(value = "update/")
    public ResponseEntity<DataDto<Long>> update(@RequestBody MultipartFile file) {
        PictureUpdateDto dto=new PictureUpdateDto( file );
        return service.update(dto);
    }

    @GetMapping(value = "get/{id}")
    public void get(@PathVariable Long id,HttpServletResponse response) throws IOException {
        service.getPicture(id, response );
    }
}
