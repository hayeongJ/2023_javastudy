package day13.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {
		Ex01_Constructor p1 = new Ex01_Constructor();
		
		System.out.println(p1);		// p1 찍으면 생성주소 나옴
		System.out.println("=====================================");
		/* Q.
		 System.out.println("기본 생성자 : " + this);와
		 System.out.println(p1); 중 누가 먼저 찍히는지?
		 A. 전 자가 먼저 찍힌다. 메인을 출력하자마자 생성자 호출
		 */
		
		// 외부에서 접근하는 것을 제한한다.
		// System.out.println(p1.name);
		
		// 접근 가능하게 하려면 자기 자신 this
		System.out.println(p1.getName());
		
	}
}
