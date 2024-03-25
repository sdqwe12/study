package com.mh.restaoi05.jwt;

import com.mh.restaoi05.member.Member;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Date;
import static io.jsonwebtoken.security.Keys.hmacShaKeyFor;

@Component
public class TokenManager {

    @Value("${mh.jwt.secret}")
    private String mykey;

    //토큰발급해주는함수
    public String generateToken(Member member) {
        return Jwts.builder()
                .subject("mhToken")
                .claim("id",member.getId())
                .claim("username",member.getUsername())
                .claim("role",member.getRole())
                .claim("email",member.getEmail())
                //유효시간은 1000 * 60 * 60 * 10   10시간
//                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                //유효시간은 1000 * 60 * 15   15분
//                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 15))
                //유효시간은 60초
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 15))


                .signWith(hmacShaKeyFor(mykey.getBytes()))
                .compact();
    }

    //토큰검증해주는함수
    public Jws<Claims> validateToken(String token){

        Jws<Claims> jws = Jwts.parser() //번역해라
                .setSigningKey(hmacShaKeyFor(mykey.getBytes())) //비밀번호로
                .build() //객체생성하고 버젼업이 되서 빌드 꼭 적어줘야함
                .parseClaimsJws(token); //claim들을 번역해라 컬렉션타입으로 만들고
        System.out.println(jws);

        return jws;
    }
    //jwt발급 ->카카오로그인

}
