package day16.com.ict.edu;

public class Ex01_enum {
	// 열거형(enum) : 상수를 하나의 객체로 인식하고, 여러개의 상수 객체들을 한 곳에 모아둔 하나의 묶음
	
	int su = 12;
	static final int JAVA =200;
	static final int HTML =300;
	
	public void play() {
		// 지역 변수는 static을 사용할 수 없다.
		// 지역변수는 메소드 호출시 만들어짐 -> 호출 전 미리 만드는것이 되기 때문에 static을 쓸 수 없음
		// static final int CSS =500;
	}
	
	// 열거형
	public enum Lesson{
		JAVA, JSP, SPRING, ANDROID, HTML
		
	}
	
	public static void main(String[] args) {
		int num = 100;
		// 지역 변수에서는 static을 사용할 수 없다.
		// static final int JSP =400; 
		// -> 
		
		// static 메소드에서는 전역변수를 쓸 수 없다
		// System.out.println(su);
		System.out.println(num);
		
		System.out.println(JAVA);
		System.out.println(HTML);
		System.out.println("===============================");
		
		// 열거형 안에 있는 JAVA 추출
		Lesson s1 = Lesson.JAVA;
		System.out.println(s1);	// 열거형 안에 있는 JAVA와 'static final ~ JAVA'는 다르다.
		System.out.println("===============================");
		
		// 한 번에 다 추출
		Lesson[] items = Lesson.values();
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]+":"+items[i].ordinal()); // ordinal() : 인덱스 값
		}
		
	}
}
