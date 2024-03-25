package ex11;

public class Person {

	String name;
	String phone;
	String gender;
	String remark;
	
	
	
	public Person() {
//		System.out.println("기본생성자");
	}
//		name, phone, gender, remark 설정 하는 메서드
	public void setPerson(String name, String phone, String gender,
			 String remark) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
		
		
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", gender=" + gender + ", remark=" + remark + "]";
	}
//	 alt + shif + s 그다음에 c면 생성자 / 생성자는 생략가능
//	 alt + shif + s -> 메뉴 뜨면 그 중에 s toString 선택하고 엔터
	
//	public String toString() {
//		return "Person "+name+phone+gender+remark;
//	}
	
}
