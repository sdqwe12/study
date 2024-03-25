package org.example;

import java.util.function.Predicate;
//메인2의 리무브이프 같은 건 가끔 쓰지만 메인3의 직접 프레디케이트를 직접 쓰는 경우는 잘 없음
public class Main3 {
    public static void doPredicate(Predicate<Integer> p, int t){
        boolean result = p.test(t);
        System.out.println(result);
    }
    public static void main(String[] args) {
        doPredicate( integer -> integer==100, 100);//t에 100을 넣어주면 테스트에 t를 넣어줘서 맞는지 확인
        doPredicate( integer -> integer==99, 100);// 함수는 do함수에 넣어죽ㅎ
    }
}
