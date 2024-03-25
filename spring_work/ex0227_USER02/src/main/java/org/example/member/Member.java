package org.example.member;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString

public class Member {
    private Long id;
    private String email;
    private String name;
    private String password;
    private LocalDateTime wdate;

}
