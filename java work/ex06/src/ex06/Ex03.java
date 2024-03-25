package ex06;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Ex03 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("src/abc.text"));
		
		int a =scan.nextInt();
		System.out.println("a = "+a);
		int b =scan.nextInt();
		System.out.println("b = "+b);
		
		if(a >= 90) {
			System.out.println("90점 이상이라 A입니다.");
		} else if (a >= 80) {
			System.out.println("80점 이상이라 B입니다.");
		} else if (a >= 70) {
			System.out.println("70점 이상이라 C입니다.");
		} else {
			System.out.println("D입니다.");
		}
		
	}

}
