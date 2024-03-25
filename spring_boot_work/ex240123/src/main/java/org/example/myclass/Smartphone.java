package org.example.myclass;
//기본생성자 생략가능 -> 다른 생성자 선언하면 기본생성자 생략불가
//super 생략가능
//tostring 생략가능

class Smartphone extends MobilePhone {
    private String anderidVer;
    public Smartphone(String number, String ver) {
        super((number));
        this.anderidVer = ver;
    }
    public void playApp() {
        System.out.println("앱 실행함 안드로이드 버전은 = "+anderidVer);
    }
}


