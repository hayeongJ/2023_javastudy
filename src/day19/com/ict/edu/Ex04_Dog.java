package day19.com.ict.edu;

public class Ex04_Dog implements Runnable{

	@Override
	public void run() {
		while(true) {
			// 3초 동안 대기 상태
			try {
				Thread.sleep(1000*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 1000 = 1초
			System.out.println("멍멍!");
		}
	}
}
