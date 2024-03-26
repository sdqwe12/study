package com.mh.fileex.user;

import com.mh.fileex.file.FileController;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
//@RequiredArgsConstructor //이미지패스의 경로를 정확하게 넣기 위해서 이거 안쓰고 생성자 직접 써줌
public class UserService {
    private final UserRepository userRepository;
    private final Path imagePath;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.imagePath = Paths.get("src/main/resource/static/images/upload/")
                                        .toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.imagePath);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void join(User user, MultipartFile imageFile) {
        try {
            //저장
            File dest = new File(imagePath + "/" + imageFile.getOriginalFilename());
            imageFile.transferTo(dest);

        }
        catch (Exception e){
            e.printStackTrace();
            return;
        }
        Link link = WebMvcLinkBuilder
                .linkTo(
                        WebMvcLinkBuilder
                                .methodOn(FileController.class)
                                .getImage(imageFile.getOriginalFilename())
                )
                .withRel("download");
        // D드라이브에 저장
//        user.setImagePath(imagePath + "/" + imageFile.getOriginalFilename());

        // http://localhost:8080/api/file/download/파일이름
        user.setImagePath(link.getHref());

        //디스크에 파일 저장시 user 저장
        userRepository.save(user);
    }
}
