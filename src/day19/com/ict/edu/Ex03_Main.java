package day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();
		
		// Runnable은 start 메소드를 갖고있지 않으므로 오류!
		// cat.start();
		System.out.println("main : " + Thread.currentThread().getName());
		
		Thread thread = new Thread(dog);
		thread.start();
		/*
		Thread thread2 = new Thread(cat);
		thread2.start();
		*/
		
		// 익명 >> 따로 호출을 할 수 없다.
		new Thread(cat).start();
		
		// 익명 2 : new 클래스(인터페이스 i) >> 익명 처리 O
		// 내부 익명
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			 while(true) {
				 System.out.println("AAAAAAA"+Thread.currentThread().getName());
			 }
			}
		}).start();;
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
