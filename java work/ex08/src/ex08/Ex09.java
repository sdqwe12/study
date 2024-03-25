package ex08;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		// min += 60 - 45;
		
		if (hour == 0 && min == 0) {
			hour = 23; min = 15;
			System.out.println(hour + " " + min);
		} else if (min >= 45) {
			System.out.println(hour + " " + (min - 45));
		} else if (hour!=0 && min <= 45) {
			System.out.println((hour-1)+" "+ (min+15));
		} else if (hour==0 && min <= 45) {
			hour = 23;
			System.out.println(hour + " " + (min+15));
		}
		

	} //m
}
