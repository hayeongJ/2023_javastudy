package day15.com.ict.edu;

public class Cat extends Animal{
	String color = "삼색이";
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	public void play() {
		System.out.println("창 밖을 바라보기");
	}
	
	/*
	 final이 있으면 Override가 안된다.
	@Override
	public void sleep() {
		System.out.println("12시간 이상 잠자기");
	}
	*/
	
}
