package ex02;

import java.util.Scanner;

//7장 가면 자세히 할게요...
class AA{
	public void doA() {
		System.out.println("AA.doA()");
}
}

public class Ex07 {
	
	public static void main(String[] args) {
		//기본형
		int a = 10;
		//참조형 타입 변수 선언
		Scanner scan = new Sacnner(System.in);
		System.out.println("입력 하세요 ");
		
		String inputString = scan.nextLine();	
		System.out.println(inputString);
		
		AA aa = new AA();
		aa.doA();
//		scan.
	}

}
