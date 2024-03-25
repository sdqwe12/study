package ex08;
//1~46 꺼낸다
//랜덤한 숫자 3개를 꺼내서 같은 숫자 나오면 true 아니면 false

public class Ex04 {
	public static void main(String[] args) {
		int a = 0,b = 0,c = 0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 0<x<1
		// 0<x<45
		//0.000001 ~44.99999
	//	for (int i = 0; i < 100; i++) 
			
		
		System.out.println((int)(Math.random()*45));
		a = (int)Math.random()*45;
		b = (int)Math.random()*45;
		c = (int)Math.random()*45;
		System.out.println(a==b || a==c || b==c);
		
	}

}
