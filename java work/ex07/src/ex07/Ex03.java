package ex07;

import java.util.Scanner;

public class Ex03 {
	// 압력은 여러개의 테스트 케이스
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; ;i++) {
			String temp = scan.nextLine();
			
			if (temp.equals("0 0")) {
	//			System.out.println("종료됩니다.");
				break;
			}
			
			int num1 = Integer.parseInt(temp.split(" ")[0]);
			int num2 = Integer.parseInt(temp.split(" ")[1]);
		System.out.println("num2 = "+ num2);
		
			
			System.out.println(temp);
			
		}
	}

}
