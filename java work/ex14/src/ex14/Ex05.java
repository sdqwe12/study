package ex14;

public class Ex05 {
	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		
		System.out.println(a+b);
		System.out.println(a.concat(b));
		//콘캣 = 문자 연결 시키
		
		System.out.println(a.substring(1)); // 1번째부터 보여라 짤라라 뒤에
		System.out.println("abcdefgh".substring(0,4));//0번째부터 4번째까지만 보여줘라 앞에
		
		String c = "abcdefg";
		String d = "abcdefg";
		String abcdefg = "10";
		
		System.out.println(c.compareTo(abcdefg));
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
}
}
