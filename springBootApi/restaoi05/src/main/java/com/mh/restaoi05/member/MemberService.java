package com.mh.restaoi05.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// memberservice는 userdetailservice이다 이즈 어 관계
//그러므로 스프링 세큐리티 에서 자동으로 등록해서 사용합니다.
@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    //저장하는 메서드
    //email 중복체크 에러로
    private final MemberRepository memberRepository;
    public Member svae(Member member){
        Optional<Member> optionalMember
        = memberRepository.findByEmail(member.getEmail());
        if (optionalMember.isPresent()){
            throw new IllegalStateException("이미 존재하는 회원입니다");
        }
        return memberRepository.save(member);
    }
    public List<Member> getAllMembers(){return memberRepository.findAll();}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("일로오나");
        return null;
    }

}
