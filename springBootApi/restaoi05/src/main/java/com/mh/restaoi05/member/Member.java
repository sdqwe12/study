package com.mh.restaoi05.member;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,nullable = false)
    private String username;
    private String password;
    @Column(length = 50,nullable = false,unique = true)
    private String email;
    //ctrl + e 최근파일 목록 보여주기
    //shift + shfit 전체파일검색
    //alt + 1 창으로 해당파일 선택

    //user admin
    @Enumerated(EnumType.STRING)
    private Role role;
    //insert 1시간
    @CreatedDate
    private LocalDateTime writeDate;
    @LastModifiedBy
    private LocalDateTime modifyDate;
}
