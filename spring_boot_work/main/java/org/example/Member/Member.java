package org.example.Member;
import lombok.*;

//@Data
@Setter
@Getter
@AllArgsConstructor
@Builder
@ToString
public class Member {
    private String email;
    private String password;
    private String name;
    private String login_satate;
    private String sign_date;
  }