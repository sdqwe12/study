package ex03;


class AA{
	public void doA() {
		System.out.println("doA");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		AA a2 = new AA(); //a2니까
		a2.doA();          //a2.
		
		String a = "abcd"; // a
		System.out.println(a.toUpperCase()); //a.
	}

}
