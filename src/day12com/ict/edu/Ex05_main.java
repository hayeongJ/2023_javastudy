package day12com.ict.edu;

public class Ex05_main {
	public static void main(String[] args) {
		// 생성자가 아무것도 없으면 기본 생성자를 제외한 생성자만 오류난다.
		Ex05_Constructor p1 = new Ex05_Constructor();
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddr());
		System.out.println("===============================");
		
		Ex05_Constructor p2 = new Ex05_Constructor("태권브이");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAddr());
		System.out.println("===============================");
		
		Ex05_Constructor p3 = new Ex05_Constructor("둘리", 1920);
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		System.out.println(p3.getAddr());
		System.out.println("===============================");
		
		Ex05_Constructor p4 = new Ex05_Constructor("임꺽정", 35, "함경도");
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		System.out.println(p4.getAddr());
		
		
	}
}
