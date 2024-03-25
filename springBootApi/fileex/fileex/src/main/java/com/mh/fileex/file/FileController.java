package com.mh.fileex.file;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/file")
public class FileController {

    private final Path imagePath;
    public FileController() {
        imagePath
                = Paths.get("src/main/resources/static/images/upload/")
                .toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.imagePath);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @PostMapping("/upload")
    public EntityModel<FileDto> uploadFile(@RequestParam("file") MultipartFile file){
//    public void uploadFile(MultipartFile file){
        try {
            System.out.println(file.getOriginalFilename());
            System.out.println(imagePath+"/"+file.getOriginalFilename());

            File dest = new File(imagePath+"/"+file.getOriginalFilename());
            file.transferTo(dest);

            EntityModel<FileDto> entityModel = EntityModel.of(new FileDto(file.getOriginalFilename()));
            WebMvcLinkBuilder link = WebMvcLinkBuilder
                    .linkTo(FileController.class)
                    .slash("download")
                    .slash(file.getOriginalFilename())
                    ;
            System.out.println(link);
            entityModel.add(link.withRel("download"));
            return entityModel;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    //http://localhost:8080/api/file/download/logo.png
    @GetMapping("download/{filename}")
    public ResponseEntity<Resource> getImage(@PathVariable String filename){
        System.out.println(filename);
        Path filePath = this.imagePath.resolve(filename).normalize();
        Resource resource = null;
        try {
            resource = new UrlResource(filePath.toUri());
        }
        catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(resource);

    }

}
