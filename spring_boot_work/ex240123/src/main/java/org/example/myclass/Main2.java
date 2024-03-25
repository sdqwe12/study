package org.example.myclass;
//기본생성자 생략가능 -> 다른 생성자 선언하면 기본생성자 생략불가
//super 생략가능
//tostring 생략가능

class MobilePhone {
    protected String number;
    // 다른 생성자 선언시 기본생성자 생략 불가

    public MobilePhone(String number) {
        this.number = number;

    }

    public void answer() {
        System.out.println("대답해따 번호는 " + number);
    }
}




public class Main2 {
    // 스마트폰은 모바일폰이다. is a 관계
    public static void main(String[] args) {
        Smartphone sp = new Smartphone("010-9946-2662", "1.0");
        sp.playApp();
        sp.answer();

        //부모 객체 //자식 개체
        //자식객체는 부모객체에 담을 수 있다.
        //부모객체는 자식 객체를 참조할 수 있다.
        //다형성이라고 한다.
        MobilePhone mp = new Smartphone("010-1234-1234", "2.0");
        mp.answer();
       // mp.playApp(); //오류뜸 왜 뜨는지
    }
}
