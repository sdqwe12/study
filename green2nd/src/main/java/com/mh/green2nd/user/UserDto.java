package com.mh.green2nd.user;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class UserDto {
    @NotBlank(message = "아이디는 필수 입력 사항입니다.")
    @Size(min = 2,max = 20)
    private String email;
    @NotBlank(message = "아이디는 필수 입력 사항입니다.")
    @Size(min = 2,max = 20)
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
