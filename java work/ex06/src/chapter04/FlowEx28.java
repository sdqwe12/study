package chapter04;
import java.util.*;

class FlowEx28 {
	public static void main(String[] args) { 
		int input  = 0;
		int answer = 0;
// Math.radom
		// 0<x<1
		// 0<x<1 x100
		/
		
		answer = (int)(Math.random() * 100) + 1; // 1~100������ ������ ���� ����
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print(">>>>");

			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);

			if(input > answer) {
				System.out.println("1111.");	
			} else if(input < answer) {
				System.out.println("2222.");			
			}
		} while(input!=answer);

		System.out.println("종료.");
	}
}
