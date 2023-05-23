package day15.com.ict.edu;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();	// 자식으로 만들면 자식 클래스의 것이 나온다.
		
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		System.out.println();
		
		cat.sound();
		cat.hobby();
		cat.sleep();
		cat.play();
		
	}
}
