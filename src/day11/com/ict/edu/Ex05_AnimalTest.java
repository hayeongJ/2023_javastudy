package day11.com.ict.edu;


public class Ex05_AnimalTest {
	public static void main(String[] args) {
	// 객체 생성
		Ex05_Animal t1 = new Ex05_Animal();
	
	// 이름 : 큰뿔소
		t1.setName("큰뿔소");
		
	// 나이 : 3
		t1.setAge(3);
		
	// 생존여부 : 살아있음
		t1.setLive(true);
		
		
	// 결과 출력
		String n1 = t1.getName();
		System.out.println("이름 : " + n1);
		int n2 = t1.getAge();
		System.out.println("나이 : " + n2);
		boolean n3 = t1.getLive();
		if(n3) {
			System.out.println("생존 여부 : 살았음");
		}else {
			System.out.println("생존 여부 : 죽었음");
		}
		System.out.println("========================");
		
		t1.play("엄지", 14, false);
		t1.prn();
		System.out.println("========================");
		
		t1.play("까치", 14, true);
		t1.prn();
		System.out.println("========================");
		
	// 이름을 펭귄으로 변경, 나이를 1살로 변경, 생존여부는 살아있음으로 변경
}
	
	
	
}
