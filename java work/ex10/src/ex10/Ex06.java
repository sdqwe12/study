package ex10;

public class Ex06 {
	//생성자 메서드 아주 조금 다름
	// 생성자는 리턴되는 값이 안적혀있음
	//메서드는 리턴값이 적혀 있음
	
	public void doA() {
		System.out.println("doA메서드 입니다.");
	}
	//static 은 메모리 공간에 항상 상주한다
	//alt shif s -> c 기본생성자 만들기
	public static void doB() {
		System.out.println("doA메서드 입니다.");
	}
	
	
	public Ex06(){
		System.out.println("기본생성자...");
	}
	
public static void main(String[] args) {
	// new Ex06();
	Ex06 ex06 = new Ex06();
	ex06.doA(); //인스턴스함수 호출
	
	Ex06.doB(); //인스턴스 함수
	System.out.println();
}
}
