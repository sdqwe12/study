package ex07;

import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		// 인트가 다섯개 모여 있는게 배열
		String a = "abcdef";
		System.out.println(a.length());
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
	
	System.out.println();
	
	int sum = 0;
	//증가대입연산자
	for(int temp: arr) {
		System.out.println(temp);
		sum+=temp;
	}
	
	String[] arr1 = {"aa", "bb", "cc", "dd"};
	String sumstr = "";
	for(String temp : arr1) {
		System.out.println(temp);
		sumstr+=temp;
	}
System.out.println(sumstr);	
	
	
	
	
}			
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//			
	}
}
