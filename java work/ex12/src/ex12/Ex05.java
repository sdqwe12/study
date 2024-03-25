package ex12;

class CapA {
	void take() {
		System.out.println("CapA 약묵음 기침 나옴");
	}
}

class CapB {
	void take() {
		System.out.println("CapA 약묵음 콧물 나옴");
	}
}

class CapC {
	void take() {
		System.out.println("CapC 약묵음 열인제 안남");
	}
}

class ColdPatient {
	void takeA(CapA a) {
		a.take();
	}
	void takeB(CapB b) {
		b.take();
	}
	void takeC(CapC c) {
		c.take();
	}	
		void takeAll(CapA a, CapB b, CapC c) {
			a.take(); b.take(); c.take();
		}
}
		
public class Ex05 {
	public static void main(String[] args) {
		ColdPatient cp = new ColdPatient();
		cp.takeAll(new CapA(), new CapB(), new CapC());
	}
}
