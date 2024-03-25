package com.example.ex03.member;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Member {
    private int idx;
    private String email;
    private String password;
    private LocalDate localDate;

}
