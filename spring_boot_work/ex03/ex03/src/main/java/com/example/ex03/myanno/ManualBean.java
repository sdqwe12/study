package com.example.ex03.myanno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//잘안씀 이거
@Retention(RetentionPolicy.RUNTIME)  //실행중에 사용되는 어노테이션
@Target(ElementType.TYPE)           //클래스 위에다가 붙일 수 있다 메소드나 변수 위에는 못붙힘
public @interface ManualBean {
}
