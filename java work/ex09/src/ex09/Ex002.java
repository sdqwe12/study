package ex09;

import java.util.Scanner;

public class Ex002 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	String sum = "";
	
	for (int i = 1; i <=N ; i++) {
		sum += "*";
		System.out.println(sum);
		
	}
	
}
}
