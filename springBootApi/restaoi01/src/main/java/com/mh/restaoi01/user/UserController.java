package com.mh.restaoi01.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

//    유저 조회하는 부분
//    보안을 위해 포스트맵핑 리퀘스트바디를 사용해서 수정한 코드
    @PostMapping("/info")
    public ResponseEntity<User> Userinfo(@RequestBody UserDto userDto){
//        String id = userDto.getId(); 이렇게 쓸 필요가 없지
//        User user = userService.userInfo(id); 유저디티오.겟아이디를 id에 담아서 매개변수로 보낸건데 그냥 바로 하면되지

        User user = userService.userInfo(userDto.getId());
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }




//    유저정보 수정하는 부분
    @PutMapping("/update")
//    public ResponseEntity<User> updateUser(@PathVariable("id") String id,@RequestBody @Valid UserDto userDto)
    public ResponseEntity<User> updateUser(@RequestBody @Valid UserDto userDto)
    {
        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(userDto, User.class);
        User dbUser = userService.update(userDto.getId(),userDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbUser);
    }



//    삭제 = resign -> Y로 수정
    @PutMapping("/delete")
//    public ResponseEntity<User> resignuser(@PathVariable("id") String id, @RequestParam("password") String password)
    public ResponseEntity<String> resignuser(@RequestBody @Valid UserDto userDto)
    {
        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(userDto, User.class);
//        User resignuser = userService.resignuser(userDto.getId(), userDto.getPassword());
        String result = userService.resignuser(userDto.getId(), userDto.getPassword());
//        String id = userDto.getId();
//        String password = userDto.getPassword();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
    }









}
