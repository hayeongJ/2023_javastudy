package day15.com.ict.edu;

// 클래스에 final을 하면 전체 다 상속 불가
// public final class Animal {
// final 변수 = 상수 => 데이터 변경 방지
// final 메소드 = 오버라이딩 방지 => 메소드 내용 변경 방지
// final 클래스 = 상속 방지 => 자식클래스 생성 방지

	public class Animal{
	int eyes=2;
	String color = "그레이";
	
	public void sound() {
		System.out.println("울음소리");
	}
	
	public void hobby() {
		System.out.println("좋아하는 행동");
	}
	
	// final : 자식이 메소드를 만들지 못하게 (변경되지 않도록) 
	public final void sleep() {
		System.out.println("8시간 이상 잠자기");
	}
}
