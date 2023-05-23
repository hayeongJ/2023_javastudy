package day14.com.ict.edu;

import java.util.Random;

public class Ex06_extends extends Random {
	// 생성자 안에서 다 처리
	
	public Ex06_extends() {
		int su = nextInt(); // 위로 올려도 됨
		System.out.println(su);
	}
	
	// 항상 main이 먼저
	// static에서는 instance 못씀
	public static void main(String[] args) {
		Ex06_extends test = new Ex06_extends();
		
		
		
	}
}
