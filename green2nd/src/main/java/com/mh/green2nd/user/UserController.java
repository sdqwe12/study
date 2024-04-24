package com.mh.green2nd.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "UserController입니다?", description = "유저관련모든기능?")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Operation(summary = "가장 처음")
    @GetMapping("/")
    public String aa(){
        return "여기로오나";
    }

    @Operation(summary = "회원가입")
    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody UserDto userDto){

        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(userDto, User.class);

        User signupUser = userService.signup(user);
        return ResponseEntity.status(HttpStatus.OK).body(signupUser);
    }

    @Operation(summary = "로그인")
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDto userDto){
        User loginuser = userService.login(userDto.getEmail(),userDto.getPassword());
                return ResponseEntity.status(HttpStatus.CREATED).body(loginuser);
    }

    @Operation(summary = "회원정보수정")
    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody UserDto userDto){
        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(userDto, User.class);
        User dbUser = userService.update(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbUser);
    }

    @Operation(summary = "회원탈퇴")
    @PutMapping("/resign")
    public ResponseEntity<String> resgin(@RequestBody User user){
        String result = userService.resignuser(user.getEmail());

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
    }
//    @Operation(summary = "이메일,비밀번호찾기")
//    @Operation(summary = "알림")
//    @PostMapping

//    public
//    회원가입 o
//    로그인 o
//    아이디,비밀번호찾기
//    회원정보수정 o
//    회원탈퇴 o
//    쿠폰함
//    알림


}
