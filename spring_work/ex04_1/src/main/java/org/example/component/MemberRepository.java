package org.example.component;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberRepository {
    @Autowired
    SqlSession sqlSession;
    public void insert() {
        sqlSession.insert("member.insert");
    }
}
