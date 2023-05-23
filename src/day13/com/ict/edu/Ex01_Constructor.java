package day13.com.ict.edu;

public class Ex01_Constructor {
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//		  지역 변수와 전역 변수 이름이 같을 때 전역 변수 앞에 this를 붙인다.
	
	// 내부 생성자 -> 내부 생성자 호출 시에는 this()를 쓴다.
	// this() : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	
	private String name = "홍길동";	// 전역 변수
	private int age = 34;
	
	public Ex01_Constructor(){
		// 생성자가 다른 생성자 호출(반드시 첫번째 줄에서)
		this("임꺽정");
		//기본생성자
		System.out.println("기본 생성자 : " + this);
		// 위 결과를 출력하기 전이랑 주소는 같게 찍힌다.(p1)
		
		// 생성자에서 메소드 호출
		prn();
		this.prn(); // 가능
	}
	
	// 생성자 오버로딩 (같은 이름의 생성자가 2개 이상 있음)
	// setter 또는 생성자를 통해 변경이 가능하다.
	// 생성자 -> 생성자 호출 가능하나 첫번째 줄에 있어야 한다.
	
	public Ex01_Constructor(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {	// 지역 변수(String name)
		this.name = name;	// this.name => 전역 변수
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void prn() {
		
	}
	
}
