package ex10;

public class Ex04 {
	public static void main(String[] args) {
		//배열은 ... 기본형타입에 배열이명 0으로 초기화
		//참조형타입은 null 값으로 초기화한다.
		Tv[] tv = new Tv[100];
		// 인스턴스화 = 메모리에 올린다
		for (int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
		}
	
		
		System.out.println(tv[0]);
		System.out.println(tv[1]);
		System.out.println(tv[2]);
		
		int[] a = new int[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		String[] c = new String[10];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
	}
	
}
