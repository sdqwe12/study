package ex11;
//Tri랑 연결
// 생성자
// 메서드
// 밑변과 높이를 지정할 수 있는 생성자

	
	


public class Ex12 {
public static void main(String[] args) {
	
	//기본 생성자 호출해서 클래스를 메모리에 올린다.
	
	Tri t1 = new Tri(10, 20);
	Tri t2 = new Tri();
	
	System.out.println(t1);
	System.out.println(t2);
	
	System.out.println(t1.area());
	System.out.println(t2.area());
}
	
}
