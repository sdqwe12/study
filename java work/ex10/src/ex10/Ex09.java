package ex10;

public class Ex09 {
		//스태틱 변수 스태틱 함수
			
	Ex09() {
		System.out.println("기본생성자");
	}
	
	public static void doA() {
		System.out.println("static 함수");
	}
	public void doB() {
		System.out.println("non-static 함수");
	}
	
	
	public static void main(String[] args) {
		
		//doB();       이것들은 안됨
		//Ex09.doB();
		
		doA();// 둘다 가능
		Ex09.doA();//둘다 가능 <<<<<------ 이게 가장 맞는 표현
	Ex09 ex09 = new Ex09();
		ex09.doA(); //이것도 가능
		ex09.doB(); //이건 가능
}//m
}
