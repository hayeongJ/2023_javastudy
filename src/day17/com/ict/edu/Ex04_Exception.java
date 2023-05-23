package day17.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

// throws : 예외 전가, 예외 양도
//			예외가 발생하면 예외 처리를 해야하지만, 현재 메소드에서는 할 수 없어서
//			자신을 호출한 곳으로 예외 객체를 전달,
//			나중에라도 예외처리(try~catch)를 하는 것이 좋다.


public class Ex04_Exception {
	public void setData(String str) throws NumberFormatException {
		// str 길이가 0보다 크면 (즉, str에 정보가 있으면) 
		if(str.length()>=1) {
			String res = str.substring(0, 1);	// 첫 번째 글자를 추출해라
			try {
			prnData(res);
			} catch(NumberFormatException e) {
				System.out.println("첫 글자는 숫자만 입력하세요!!");
			}
		}
	}
	// 메소드 호출할 수 있다.
	public void prnData(String res) throws NumberFormatException{
//		try {
			int dan = Integer.parseInt(res);
			System.out.println(dan + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
//		} catch (NumberFormatException e) {
//			System.out.println("첫글자는 숫자만 입력하세요!");
//		}
		
	}
	
	public static void main(String[] args) {
		// 아래 객체를 생성해야지만 불러다 쓸 수 있다.
		Ex04_Exception test = new Ex04_Exception();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		String msg = scan.next();
//		try {
		test.setData(msg);
//		} catch(NumberFormatException e) {
//			System.out.println("첫 글자는 숫자만 입력하세요!");
//		}
	}
}
