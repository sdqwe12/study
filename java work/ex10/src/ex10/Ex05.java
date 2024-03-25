package ex10;

class AA {
	int a = 10;
	static int b = 20; //공유변수 프로그램 시작과 동시에 초기화 되서 끝날 때까지 공유되는 변수
}

public class Ex05 {
public static void main(String[] args) {
	AA a1 = new AA();
	AA a2 = new AA();
	
	a1.a++;
	System.out.println(a1.a);
	System.err.println(a2.a);
	
	AA.b++;
	System.out.println(AA.b);
	System.out.println(AA.b);
	
}
}
