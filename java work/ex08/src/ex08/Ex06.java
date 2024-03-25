package ex08;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int productCnt = 0;
		int calcu_total = 0;
		
		total = scan.nextInt();
		productCnt = scan.nextInt();
		
		int[] itemPrice = new int[productCnt]; 
		int[] itemCnt = new int[productCnt];
		//item 입력
		for (int i = 0; i < productCnt; i++) {
			String temp = scan.nextLine();
			itemPrice[i] = scan.nextInt();
			itemCnt[i] = scan.nextInt();
		}
		//item 출력
		for (int i = 0; i < productCnt; i++) {
			calcu_total = calcu_total + (itemPrice[i] * itemCnt[i]);
			
			System.out.println("itemPrice[i]"+itemPrice[i]);
			System.out.println("itemCnt[i]"+itemCnt[i]);
			
		}
		
}
}
