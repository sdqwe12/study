package ex10;

class Tv {
	String color;
	boolean power;
	int channel;

	void poewr() {
		System.out.println("power 버튼 누름");
		power = !power;
	}

	void channelUp() {
		System.out.println("채널 올리기"); 
		channel+=1;
	}

	void channelDown() {
		System.out.println("채널 내리기");
		channel-=1;
		if (channel == -1) {
			System.out.println("채널이 음수라서 0으로 초기화함");
			channel=0;
		} 
	}
}

public class Ex02 {

	public static void main(String[] args) {
		int a = 10;
		Tv tv1 = new Tv();
		System.out.println(tv1.color);
		System.out.println(tv1.power);
		System.out.println(tv1.channel);

		tv1.poewr();
		System.out.println(tv1.power);
		
		tv1.channelDown();
		System.out.println(tv1.channel);
		tv1.channelUp();
		System.out.println(tv1.power);
		
	}

}
