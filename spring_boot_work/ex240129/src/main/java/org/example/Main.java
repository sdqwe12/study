package org.example;

//다형성으로 모든 객체는 부모 객체에 담을 수 있다.
// alt insert = constructoy
// alt + insert tostring
class Apple {
    private String name;

    public Apple(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Orange{
    private String name;
    public Orange(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                '}';
    }
}
// 제네릭 이전에는
class Box<T> {

    public Box(){

    }

    public Box(T t){
        this.obj = t;
    }
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                '}';
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box();
        box1.setObj(new Apple("사과"));

        Box<Orange> box2 = new Box();
        box2.setObj(new Orange("오렌지"));

            Apple apple = box1.getObj();
            Orange orange = box2.getObj();

              System.out.println(orange);
              System.out.println(apple);
    }
}