package day20.com.ict.edu;

// 동기화 처리할 때 현재 실행중인 스레드를 강제로 대기 상태로 변경시키기

public class Ex03 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x +":"+Thread.currentThread().getName());
			if(x==11) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
}
