package ex03;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	// 참조 변수 선언
	Scanner scan = new Scanner(System.in);
	//문자열 입력 출력해라
	System.out.println("문자열 입력");
	// 입력 받아라... nex 함수는 빈공백 String 5
	String str = scan.next();
	System.out.println("반복횟수 입력");
	int n = scan.nextInt();
	
	System.out.println("str = "+str);
	System.out.println("n = "+n);
	
	//제어문 4장이라함
	/* i = 0 일 때 for구문 안에 있는거 반복해라
	 * i++ = i = i+1
	 * i=1+2하면 2칸식 증가 0 2 4 
	 */
		for (int i = 0; i<5 ; i++) {
			System.out.println(i);
			
		}
	System.out.println("일로 옵니다.");
	
}

}
