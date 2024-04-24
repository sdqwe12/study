package com.mh.green2nd.user;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    @Id
    @Column(name = "email", nullable = false, unique = true)
    @Schema(title = "이메일",description = "이메일 입력")
    private String email;
    @Column(name = "password", nullable = false)
    @Schema(title = "패스워드",description = "패스워드 입력부분입니다")
    private String password;

    @Column()
    @Schema(title = "닉네임",description = "닉네임 입력부분입니다")
    private String nickname;

    @Column()
    @Schema(title = "휴대폰")
    private int phone;

    @Column()
    @Schema()
    private String birthdate;

    @Enumerated(EnumType.STRING)
    @Schema(title = "탈퇴여부")
    private Resign resign;

    @Enumerated(EnumType.STRING)
    @Schema(title = "로그인상태")
    private Loginstate loginstate;

    @Enumerated(EnumType.STRING)
    @Schema(title = "권한")
    private Role role;

}
