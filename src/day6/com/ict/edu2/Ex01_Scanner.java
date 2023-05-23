package day6.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out -> 표준 출력장치 (모니터)
		// System.in -> 표준 입력장치 (키보드)
		// 회사에서 제공하는 클래스를 사용하기 위해서 import를 해야한다.
		// java.lang에 없는건 import를 해줘야한다.
		// java.lang 패키지 안에 존재하는 클래스는 아무런 제약없이 사용가능 (import 안함)
		
		// <import 방법>
		// 1. Scanner 뒤에 ctrl+shift+o 해주면 import 설정됨
		// 2. ctrl+스페이스바
		
		
		// 해당 클래스 뒤에 커서를 놓고 shift+f2 => 해당 클래스 API 설명서가 나타난다.
		int su =10;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이름 : ");
		
		//.next(); 입력한 내용을 String으로 처리하는 메소드
		// > 단점 :띄어쓰기를 하면 다음 내용에 영향을 줄 수 있으니 쓰지 않기
		
		String name = scan.next(); // 띄어쓰기나 엔터를 하면 거기까지만 읽음
		System.out.println("받은 내용 : " + name);
		
		System.out.print("나이 : ");
		String age = scan.next();
		System.out.println("받은 내용 : " + (age+1)); // age가 String 상태여서 
		//											  입력 숫자 와 1이 출력
		
		System.out.print("나이 : ");
		// .nextInt() : 입력한 내용을 int로 처리(문자를 입력하면 오류)
		int age2 = scan.nextInt(); 
		System.out.println("받은 내용 : " + (age2+1));
		
		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double로 처리 (문자를 입력하면 오류)
		double ke = scan.nextDouble();
		System.out.println("받은 내용 : " + ke);
		
		
		System.out.print("당신은 남성입니까?(true/false)");
		// .nextBoolean() : 입력한 내용을 boolean으로 처리하는 메소드(숫자 및 다른 문자 입력하면 오류)
		boolean gender = scan.nextBoolean();
		System.out.println("받은 내용 : " + gender);			
			if (gender) {
				System.out.println("당신은 남성입니다.");
			} else {
				System.out.println("당신은 여성입니다.");
			}
		
		// nextChar()는 존재하지 않는다. 그러므로 char는 사용 못함.
		
		
		
	}
}
