package day20.com.ict.edu2;

// 5. 두 개의 스레드를 생성하여 첫번째 스레드의 출력을 1-100 까지 출력하고,
//	  두 번째 스레드가 출력을 101-200 까지 출력하라 (반드시 synchronized 사용)


public class Ex01 implements Runnable {
	public static void main(String[] args) {
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	
}
