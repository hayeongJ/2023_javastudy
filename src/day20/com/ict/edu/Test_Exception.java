package day20.com.ict.edu;

import java.util.Scanner;

public class Test_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				int su1 = 50;
				System.out.print("정수 입력 : ");
				int su2 = scan.nextInt();
				System.out.println("정답 : " + (su1/su2));
			} catch (ArithmeticException e) {
				System.out.println("다시 입력하세용");
			}
		}
		
	}
}
// ArithmeticException