package com.mh.restapi05.main.member;

import com.mh.restapi05.member.Member;
import com.mh.restapi05.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MainMemberService implements UserDetailsService {

    //crud이걸로
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println("일로오나"+email);
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        System.out.println("optionalMember" + optionalMember);

        if (optionalMember.isEmpty()){
            System.out.println("해당하는 사용자가 없습니다.");
        }

        Member member = optionalMember.get();

        return User.builder()
                .username(optionalMember.get().getEmail())
                .password(member.getPassword())
//                .password(passwordEncoder.encode("1234"))
                .roles(member.getRole().toString())
                .build();
    }
}
