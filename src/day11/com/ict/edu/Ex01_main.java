package day11.com.ict.edu;

public class Ex01_main {
	String str = "대한민국";
	
	public static void main(String[] args) {
		
		// static 객체 생성과 상관없이 호출 가능
		// static 호출 : 클래스 이름.변수, 클래스 이름.메소드
		// static은 잘못 만들면 싹 바껴야하는 상황이 생길 수 있으니 조심해야 함!!
		// private는 접근 불가
		
		System.out.println(Ex01_method.ki);
		
		Ex01_method t1 = new Ex01_method();
		
		
		// 인스턴스 호출 방법 ; 참조변수.변수, 참조변수.메소드
		String n = t1.name ; 	// 변수를 호출하면 변수값이 현재 위치로 온다. >> 변수값을 n에 저장
		
		// void는 호출한 곳으로 아무것도 가져오지 않는다.
		t1.getTotal();
		
		// total 값이 변경된 것을 확인
		int k1 = t1.total;
		System.out.println(n);
		System.out.println(k1);
		
		// str = "korea"; >> 현재 static 메소드 안에 있어서 instance 메소드는 쓸 수 없다.
		System.out.println("=================");
		
		double k2 = Ex01_method.getAvg2();
		System.out.println(k2);
				
	}
}
