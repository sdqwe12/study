package ex13;

class InstClass {
	static int num = 0;
	InstClass() {
	num++;
	System.out.println("생성자 호출 "+num);
}
}
public class Ex01 {
	
public static void main(String[] args) {
	
	InstClass.num = 10;
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println(InstClass.num);
	
	
}
}
