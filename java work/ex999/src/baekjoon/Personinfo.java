package baekjoon;

public class Personinfo {
private int num;
private String name;
private String hp;
private String tel;

public Personinfo(String name, String hp, String tel) {
	this.name = name;
	this.hp = hp;
	this.tel = tel;
	
}

public int getNum() {
	return num;
}

public void setNum(int Num) {
	this.num = num;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
}
