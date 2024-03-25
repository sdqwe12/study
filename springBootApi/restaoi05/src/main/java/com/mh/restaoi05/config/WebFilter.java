package com.mh.restaoi05.config;

import com.mh.restaoi05.jwt.TokenManager;
import com.mh.restaoi05.member.Member;
import com.mh.restaoi05.member.MemberRepository;
import com.mh.restaoi05.member.Role;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class WebFilter extends OncePerRequestFilter {
    //new 안쓰고 객체 만드는 방법
    private final TokenManager tokenManager;



    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        System.out.println("필터 동작");
        // 서버에 해당되는 id,password 가 맞으면 다음으로 진행
        String token = request.getHeader("Authorization");
        System.out.println(token);
        String url = request.getRequestURI();
        // member 호출하면 mypage 호출하면
        if (url.contains("login") || url.contains("join") || url.contains("token")){
            filterChain.doFilter(request, response);
            return;
        }
        if (token == null || !token.startsWith("Bearer ")){
            System.out.println("token 없습니다");
            throw new RuntimeException("token 발행해");
        }

        try {
            Jws<Claims> jws = tokenManager.validateToken(token.substring("Bearer ".length()));
            List<SimpleGrantedAuthority> roles =
                    new ArrayList<>();
            roles.add(new SimpleGrantedAuthority("USER"));
            System.out.println(roles);
            //로그인한 사람 정보를 authentication에 저장해라
            Authentication authentication = UsernamePasswordAuthenticationToken.authenticated(
                    Member.builder()
                            .email(jws.getPayload().get("email").toString())
                            .username(jws.getPayload().get("username").toString())
                            .id(jws.getPayload().get("id", Long.class))
                            .role(
                                    Role.fromString(jws.getPayload().get("role").toString())
                            )
                            .build(),
                    null,
                    roles
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);

            filterChain.doFilter(request, response);

        }
        catch (ExpiredJwtException e){
            System.out.println("토큰 만료");
            throw new RuntimeException("JWT 토큰 만료");
        }
        catch (Exception e){
            System.out.println("토큰검증실패");
            e.printStackTrace();
//            throw new RuntimeException("jwt 토큰검증실패");
        }



        // 그 다음으로 이도애서 진행해라... member, test , todo
        filterChain.doFilter(request, response);

    }
}
