package day11.com.ict.edu;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04_method t1 = new Ex04_method();
		
		t1.add();
		System.out.println(t1.result); 
		t1.add(1000);
		System.out.println(t1.result); 
		t1.add(100, 24);
		System.out.println(t1.result); 
		
		// System.out.println(t1.result); 	// 변수는 가장 마지막 저장된 것만 기억하기 때문에 t1.add(100,24); 결과가 나온다
		System.out.println("=================================");
		
		int k1 = t1.sub();
		System.out.println(k1);
		
		int k2 = t1.sub(120);
		System.out.println(k2);
		
		int k3 = t1.sub(24, 12);
		System.out.println(k3);
		
		
	}
}
