package com.mh.restaoi05.member;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //select * from member like email = ?
    //해당하는 email이 있는지 검사 하는 메서드
    Optional<Member> findByEmail(String email);

    Member findByEmailAndPassword(String email,String password);
}
