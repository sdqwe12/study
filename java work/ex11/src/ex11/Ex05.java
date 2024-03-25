package ex11;
//기본생성자도
//impor java.lang.*;도
//toString도
//다 생략 되어있음
public class Ex05 {
	
	public static void main(String[] args) {
	
		Data d1 = new Data();
//		Ex05 ex05 = new Ex05(); //메모리에 올리고
		Data d2 = copy(d1);
		//Data d2 = d1; // d1의 값만 d2에 넣는게 아니라
		// d2=d1이 되버려서 d2의 값을 바꾸면 d1도 바뀌게 되서
		
		d2.x = 100;
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		
	}
//	clss aa {
//		public 반환값 메서드명() {
//		return 10;
//		} 외워야 된다
//	}	
	static Data copy(Data d) {
		Data data = new Data();
		data.x = d.x;
		return data;
	}
	
}


class Data {
	int x = 10;

	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}
	
	
}