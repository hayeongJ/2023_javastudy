package day11.com.ict.edu;

public class Ex01_method {
	// 클래스 : 멤버필드, 멤버 메소드, 생성자
	// 멤버필드 : 인스턴스 변수, 인스턴스 상수, static 변수, static 상수
	
	String name = "홍길동";	// 인스턴스 변수
	int kor = 80;			// 인스턴스 변수
	int eng = 95;			// 인스턴스 변수
	int math = 85;			// 인스턴스 변수
	int total = 0;			// 인스턴스 변수
	double avg = 0.0;		// 인스턴스 변수
	
	static double ki = 178.5;	// static 변수
	
	
	// 멤버 메소드() : 동작, 기능, 실행하는 것
	//	** 메소드는 호출해야만 실행할 수 있고, 실행 후 반드시 되돌아간다.
	// 형식) [접근제한자][메소드종류]반환형 메소드이름([인자],...){ 실행할 내용 } 
	//								 => 인자는 없어도 된다.
	//	** 반환형 : 반드시 호출한 곳으로 되돌아 가는데 실행결과를 가지고 갈 때, 실행결과의 자료형을 반환함
	// 			 실행결과를 가지고 가지 않으면 void라는 예약어를 사용한다.
	
	// call by value(값), call by reference (주소값)=> 고급코딩
	
	
	// instance 메소드
	// 이름은 같아도 인자가 달라야 오류가 나지 않는다.
	public void getTotal() {	
		total = kor+eng+math;
		// return;	// void에서는 굳이 return;을 할 필요가 없다 >> 반환값이 없기 때문!
	}
	public int getTotal2() {
		int sum = kor + eng + math;
		// 반환형이 void가 아니면 맨 마지막 줄에 return 데이터나 해당 자료형 변수를쓴다.
		return sum;
	}
	public int getTotal3() {
		return kor+eng+math+(int)(ki);
	}
	
	// static
	public static void getAvg() {
		// static일 경우는 instance 변수 사용 불가
		// avg = total /3.0;
		
		// ki가 static 이므로 사용 가능
		ki=ki+5;
	}
	public static double getAvg2() {
		return ki=  ki + 0.7;
	}
	
	
	
	
}
