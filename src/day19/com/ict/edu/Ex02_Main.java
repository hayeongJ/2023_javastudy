package day19.com.ict.edu;

public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		// 멀티스레드 : 여러개의 스레드를 만들어서 병렬처리
		// 스레드 만드는 방법 : start()를 호출해서 run()메소드로 가면 스레드 생성
		
		dog.start();
		cat.start(); 
		// start()를 하면 start를 찾는다. >> 없으니 run()을 찾는다.
		// start에서 start, run에서 run은 그냥 호출한 것
		
		// 순서는 운영체제에서 정함 (지맘대로)
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
