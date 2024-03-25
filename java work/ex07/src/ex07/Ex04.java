package ex07;

import java.util.Scanner;

//* 첫번째줄 1번 반복
//** 둘째는 2번 반복
//*** 셋째는 3번 반복
//****
//****


public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int roNum = scan.nextInt();
		
		for (int i = 0; i < roNum; i++) {
	//		System.out.println("i = "+ i);
			// i+1 = 1
			//i+
			for (int j = 0; j < i+1; j++) {
	//			System.out.println("j = "+ j);
				System.out.println("*");
			}
		}
	}

}
