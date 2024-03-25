package ex14;

public class Person {
private int regNum;
private int passNum;

public Person(int regNum) {
	System.out.println("regNum 생성자");
	this.regNum = regNum; // 값 넣어주는거 레그넘에 레그넘 값을
}

//alt shift s -> o 생성자
public Person(int regNum, int passNum) {
	//super(); //생략가능
	this(regNum); //this는 생성자에서 다른 생성자로 가는거
	System.out.println("regNum 생성자 passNum 생성자");
	//this.regNum = regNum;
	this.passNum = passNum;
}

// alt shif s -> s 투 스트링
@Override
public String toString() {
	return "Person [regNum=" + regNum + ", passNum=" + passNum + "]";
}

	
}
