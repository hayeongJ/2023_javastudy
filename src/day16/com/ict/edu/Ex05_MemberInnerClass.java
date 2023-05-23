package day16.com.ict.edu;

public class Ex05_MemberInnerClass {
	String name ="홍길동";
	private int age = 24;
	static boolean gender = true;
	
	public Ex05_MemberInnerClass() {
		System.out.println("외부 생성자 : " + this);
	}
	public void play() {
		int money = 1000;
		System.out.println("외부 메소드 : "+ name);
		System.out.println("외부 메소드 : "+ money);
	}
	
	// 내부 클래스의 멤버 변수가 static이면 class를 static으로 만들어야한다.
	// 권장사항은 아님 (일반 클래스에서는 static 사용 불가)
	public static class Inner01{
		String addr ="서울 마포구";
		int roomNumber=1;
		static int count = 30;
		
		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}
		public void prn() {
			int weight =79;
			System.out.println(addr);
			System.out.println(roomNumber);
			
			// 외부 클래스의 멤버도 마음대로 사용가능 (private)
//			System.out.println(name);
//			System.out.println(age);
			System.out.println(gender);
			
		}
	}
}
