package ex13;

public class Ex02 {
 public static void main(String[] args) {
	InstClass ic = new InstClass();
	System.out.println(ic.num++);//출력하고 증가
	
	System.out.println(InstClass.num++);//출력하고 증가
	
	System.out.println(InstClass.num);
}
}
