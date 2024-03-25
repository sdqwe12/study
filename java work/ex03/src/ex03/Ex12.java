package ex03;

import java.util.Scanner;

/*실수는 소수 두번째
 * 숫자를 입력받아 소수 둘째짜리까지
 * ex)
 * 23.456 -> 23.45 11.1335 -> 11.13
 */


public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		// next() 문자열입력... 빈공백전까지...
		///nextline() 문자열 한줄..
		// nextInt 정수입력
		//nextdouble()실수 입력...
		
		double d = scan.nextDouble();
		System.out.println("d = "+d);
		// 45.123123123 *100
		// 4512.123 ->int = 소수점 날리지
		//4512/100-> double
		// 45.12
		//double trans_d =(int)(d*100)/100.0;
		//System.out.println("trans_d = "+trans_d);
		System.out.println("trans_d = "+(int)(d*100)/100.0);
	
		
		
	}

}
