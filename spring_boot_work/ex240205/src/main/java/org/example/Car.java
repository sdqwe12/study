package org.example;

//alt + 1
//alt + insert
//자바클래스 선택
public class Car implements Comparable<Car> {
    private int disp;

    public int getDisp() { return disp;}
//    생성자 생성
    public Car(int disp) {
        this.disp = disp;
    }
//    투스트링 생성
    @Override
    public String toString() {
        return "Car{" +
                "disp=" + disp +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.disp - o.disp;
    }
}
