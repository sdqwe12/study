package com.mh.restaoi05.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    @GetMapping("")
    public String member(Authentication authentication) {
        Member member = (Member) authentication.getPrincipal();
        return "getMember email = "+member.getEmail()+
                " : username : "+member.getUsername()+
                " : role : "+member.getRole();
    }

    // 1. db 저장하고 -> 유효성 검사를 하다가...
    // 2. security 추가
    // 3. 로그인할때 email password
    // 4. email password 로그인 해주는거

    @PostMapping("/join")
    public ResponseEntity<String> member(@Valid @RequestBody MemberDto memberDto){
        System.out.println("일로오나...");

        ModelMapper modelMapper = new ModelMapper();
        Member member = modelMapper.map(memberDto, Member.class);

        memberService.svae(member);
        return ResponseEntity.status(HttpStatus.OK).body("회원가입 성공");
    }

    @GetMapping("list")
    public ResponseEntity<List<Member>> membeer(){
        List<Member> allMembers = memberService.getAllMembers();
        return ResponseEntity.status(HttpStatus.OK).body(allMembers);
    }

}
