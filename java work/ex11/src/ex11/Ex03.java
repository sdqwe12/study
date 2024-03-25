package ex11;

import java.util.Arrays;

public class Ex03 {
// 배열을 선언하고 배열을 정렬하고 배열의 모든 값을 더해서 출력하기
//	메서드를 이용해서
	
	
	
	Ex03() {
//		int	arr[] = new int [] {10, 20, 5, 2, 11};
		int	arr[] = {10, 20, 5, 2, 11};
		ArrayU myU = new ArrayU();
		myU.sort(arr);
		myU.print(arr);
		
//		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < 5; i++) {
//			System.out.print(arr[i]+"\t");
//		}
}
	
	
	public static void main(String[] args) {
		new Ex03();
	}

}
