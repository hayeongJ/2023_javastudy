package day14.com.ict.edu;

// 자식 클래스에서 부모클래스를 선택해서 상속관계를 맺는다.
// 상속 관계 : 자식 클래스가 부모 클래스의 멤버필드와 멤버 메소드를 마음대로 사용할 수 있는 관계
// 형식 : class 자식클래스 extends 부모클래스
// 특징 : 모든 클래스는 하나의 부모클래스를 갖는다.
//		 부모 클래스가 없으면 object가 부모클래스이다.
// 		 다중 상속을 지원하지 않는다. (즉, 부모클래스는 하나만 존재한다.)
//		 

public class Ex03_Sub extends Ex03_Super {
	String name ="홍반장";
	int age =13;
	double weight = 78.9;
	private String cat ="야옹이";
	
	static String computer = "10세대";
	
	public Ex03_Sub() {
		System.out.println("자식 클래스 생성자 : " + this);
	}
	
	public void play() {
		String name = "홍두깨";
		// 변수 우선 순위
		// 지역변수 > 전역변수(this) > 부모클래스변수(super)
		System.out.println(name); // 홍두깨
		System.out.println(this.name); // 홍반장
		System.out.println(super.name); // 홍길동
		// > public class에서 extends Ex03_Super를 안해주면 super.name 오류남
		
		// 지역변수가 없고, 전역변수 또는 부모클래스 있으면
		System.out.println(weight);
		System.out.println(this.weight);
		
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr); // this보다는 super 쓰기
		
		// private인 경우
		System.out.println(cat);
		
		// private은 접근할 수 없다.
		// System.out.println(dog);
		// System.out.println(super.dog);
		
		// static인 경우
		System.out.println(playStation);
		System.out.println(this.playStation);
		System.out.println(super.playStation);
		System.out.println(Ex03_Super.playStation);
		// private가 붙으면 어떤것이든 상속 불가
		
		System.out.println(computer);
		System.out.println(this.computer);
		System.out.println(Ex03_Sub.computer);
		
		
	}
}
