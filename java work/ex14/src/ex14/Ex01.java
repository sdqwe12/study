package ex14;

public class Ex01 {
	
	Ex01() {
		System.out.println("기본 생성자");
	}
	Ex01(int a, int b) {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	Ex01(String c) {
		System.out.println("c = "+c);
	}
	
	public static void main(String[] args) {
		new Ex01();
		new Ex01(10,20);
		new Ex01("문자열 출력");
	}
}
