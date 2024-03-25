package org.example.myclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
//@는 무조건 클래스 위에 써야 빨간줄 안남
public class Member {

    private String name;

    private int age;
}
