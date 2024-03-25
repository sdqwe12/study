package org.example.member;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@ToString
@Setter
@Getter
@Builder

public class Member {
    private int id;
    private String email;
    private String name;
    private String password;
    private String confirmPassword;
    private LocalDate localDate;

}
