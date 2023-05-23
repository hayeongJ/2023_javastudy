package day11.com.ict.edu;
// 가지고 올 수도 있고, 변경할 수도 있어야 함

public class Ex05_Animal {
	
	// 생존 여부
	boolean live;
	
	// 나이
	int age;
	
	// 이름
	String name;
	
	
	// 생존 여부를 변경하는 메소드
	public  void setLive(boolean k1) {
		live = k1;  
	}
	// 생존 여부를 반환하는 메소드
	public boolean getLive() {
		return live;
	}
		
	
	// 나이를 변경하는 메소드
	public void setAge(int k2) {
		age = k2;
	}
	
	// 나이를 반환하는 메소드
	public int getAge() {
		return age;
	}	
	
	// 이름을 변경하는 메소드
	public void setName(String k3) {
		name = k3;
		
	}
	
	// 이름을 반환하는 메소드
	public String getName() {
		return name;
	}
	
	// 이름, 나이, 생존여부 한번에 변경하자
	public void play(String s1, int s2, boolean s3) { // 인자 순서가 달라도 다른것!
		name = s1;
		age = s2;
		live = s3;
	}
	// 이름, 나이, 생존여부 한번에 반환하자
	// 이름, 나이, 생존여부 한번에 출력하자
	// 여기서 출력해도 됨 >> AnimalTest에서 출력하지 않아도 됨
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		if (live) {
			System.out.println("생존여부 : 살았음");
		} else {
			System.out.println("생존여부 : 죽었음");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
