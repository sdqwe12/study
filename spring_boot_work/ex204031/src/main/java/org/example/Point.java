package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//클론 메서드를 정의 하려면
// cloneable 인터페이스를 상속 받아야 합니다
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Point implements Cloneable{
    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
