package day15.com.ict.edu2;

public class Ex04_Dog extends Ex04_abstract {
	String name ="개똥이";
	
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	// 오버라이딩 해도 되고 안해도 됨 ↓
	@Override
	public void play() {
		System.out.println("바다에서 놀기");
	}
	public String getName() {
		return this.name;
	}
}
