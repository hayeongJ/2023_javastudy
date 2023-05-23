package day19.com.ict.edu;

// 상속을 받아야 함 >> extends
public class Ex02_Dog extends Thread{
	// 실제 일하는건 run >> 시험!
	// 부모꺼를 가져와서 내용만 입력 >> 오버라이딩
	/*
	public void start() {
		for(int i =0; i<20; i++) {
			System.out.println("멍멍!"+Thread.currentThread().getName());
		}
	}
	*/
	@Override
	public void run() {
		for(; ;) {
			System.out.println("멍멍!"+Thread.currentThread().getName());
		}
	}
	
	
}
