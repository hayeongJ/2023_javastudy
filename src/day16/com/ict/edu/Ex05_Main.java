package day16.com.ict.edu;

public class Ex05_Main {
	public static void main(String[] args) {
		// 내부 클래스를 별도로 객체 생성할 수 없다(static 문 제외)
		// Inner01 test = new Inner01();
		
		// 외부 클래스를 통해서 내부 클래스 객체를 생성한다.(Member 내부 클래스)
		Ex05_MemberInnerClass test = new Ex05_MemberInnerClass();
		
		// 출력했을 때 $ 표시가 있으면 내부 클래스를 의미한다.
		Ex05_MemberInnerClass.Inner01 exam = test.new Inner01();
		
		exam.prn();
		System.out.println();
		test.play();
	}
}
