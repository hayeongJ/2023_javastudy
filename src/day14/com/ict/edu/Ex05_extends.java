package day14.com.ict.edu;

import java.util.Random;

// FM 방법
public class Ex05_extends extends Random {
	int su = nextInt();
	
	public void play() {
		System.out.println(su);
	}
	
	// static 메소드는 static 변수만 사용 가능
	public static void main(String[] args) {
		// System.out.println(su);
		// play();
		
		// 자기 자신이라도 객체를 만들자
		Ex05_extends test = new Ex05_extends(); // 참조 변수!! static도 instance도 아님
		test.play();
	}
}
