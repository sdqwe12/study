package com.mh.fileex.user;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//dto는 유효성 검사를 위한 곳
//프론쪽에서 데이터 넘어오면 비어있으면 안된다 그런거 검사
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;

   @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    private String role;
    private String imagePath;
}
