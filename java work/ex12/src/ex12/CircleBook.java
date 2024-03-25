package ex12;
/* 반지름 원넓이
 * 클래스는 변수와 메서드로
 */ 

public class CircleBook {
	 private int rad;
	 // private 다른 클래스에서 이 변수 참조 불가
	 //private 쓰려면 setRad 해줘라
	 final double PI = 3.14;
	 
	 public CircleBook() {
		 
	 }
	 // alt +shift + s / +o
	 public CircleBook(int rad) {
		this.rad = rad;
	}

	 public void setRad(int r) {
		 if (r < 0) { this.rad = 0; return;}
		 this.rad = r;
	 }

	//public 모든 클래스에 호출 가능
	 public double getArea() {
		 return rad * rad * PI;
	 }
	 
}
