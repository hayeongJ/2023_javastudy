package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식 클래스를 객체로 만들면 자식 보다 부모 클래스가 먼저!! 알아서 만들어진다.
		
		Ex03_Sub sub = new Ex03_Sub();
		System.out.println("메인에서 생성자 호출 : " +sub );
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		System.out.println(sub.addr); // sub에는 없지만 부모(super)에 있는 것이라 가능
		
		// 외부에서는 private 안됨
		// System.out.println(sub.dog);
		
		// static (접근제한자가 우선순위가 높다.)
		System.out.println(sub.playStation); // 이렇게 써도 되지만
		System.out.println(Ex03_Sub.computer); // 이렇게 쓰는걸 권장
		System.out.println(Ex03_Super.playStation);
		
	}
}
