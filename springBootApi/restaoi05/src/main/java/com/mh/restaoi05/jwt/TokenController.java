package com.mh.restaoi05.jwt;

import com.mh.restaoi05.member.Member;
import com.mh.restaoi05.member.MemberRepository;
import com.mh.restaoi05.member.Role;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TokenController {

    private final TokenManager tokenManager;
    private final MemberRepository memberRepository;

    @GetMapping("auth")
    public String loginTest(Authentication authentication){
        System.out.println(authentication);
        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getPrincipal());
        return "loginTest";
    }

    @GetMapping("/token")
//    public String token(String email,String password){
    public String token(@RequestBody TokenDto tokenDto){
        System.out.println("email = " + tokenDto.getEmail());
        System.out.println("password = " + tokenDto.getPassword());
        Member dbmember = memberRepository.findByEmailAndPassword(tokenDto.getEmail(),tokenDto.getPassword());
        if (dbmember == null){
            throw new RuntimeException("인증안됨");
        }
//        Member member = Member.builder()
//                .email("aaa@naver.com")
//                .id(1l)
//                .username("홍길동")
//                .role(Role.USER)
//                .build();
        return tokenManager.generateToken(dbmember);
    }

    @GetMapping("/valid")
    public String valid(HttpServletRequest request){

        String auth = request.getHeader("Authorization");
        System.out.println(auth);
//        tokenManager.validateToken(eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtaFRva2VuIiwiaWQiOjEsInVzZXJuYW1lIjoi7ZmN6ri464-ZIiwicm9sZSI6IlVTRVIiLCJlbWFpbCI6ImFhYUBuYXZlci5jb20iLCJleHAiOjE3MTA5ODM1Nzh9.O_n9eQrzMw0BrYFoNU0cMZMI0MGLaD17-ukIqSAXOp0)

        return "valid";
    }
}
