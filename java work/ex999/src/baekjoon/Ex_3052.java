package baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ex_3052 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] arr = new int[10]; //자연수 10 입력
	int[] brr = new int[42]; // 42로 나누어 나누면 나머지는 0~41까지 존재
	int count = 0; // 나머지의 개수
	int num = 0; // 입력
	
	String[] str = {"w" , "w" , "q"};
	
	String[] st = Arrays.stream(str).distinct().toArray(String[]::new);
	
	System.out.println(Arrays.toString(st));
	
}
}
