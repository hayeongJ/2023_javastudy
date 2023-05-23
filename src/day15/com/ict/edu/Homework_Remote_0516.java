package day15.com.ict.edu;

import java.util.Scanner;

public class Homework_Remote_0516 {
	public static void main(String[] args) {
		// 볼륨조절 리모콘 만들기
		// - 각 장치를 볼륨조절 할 수 있다.
		// 볼륨의 기본값은 3이다.
		// 볼륨은 0~10
		// 만드는 방법은 마음대로 (일반적, 상속, 인터페이스)
		
		Scanner scan = new Scanner(System.in);
		
		// 장치 선택하기
		esc:
			while(true) {
				
		System.out.println("====== 장치를 선택하세요! ======");
		System.out.println("1. TV | 2. 컴퓨터 스피커 | 3. 이어폰");
		int su = scan.nextInt();		// 장치 선택하기
		int vol = 3;
		switch (su) {
		// TV
		case 1 : System.out.println("TV 볼륨을 설정합니다.");
				System.out.println("현재 볼륨은 " + vol + "입니다.");
				System.out.println("===========================");
				System.out.println("1.볼륨 UP | 2. 볼륨 Down");
				int num1 = scan.nextInt();
				switch (num1) {
				
				case 1 : System.out.println("볼륨을 1 올립니다");
				vol++; 
				System.out.println("현재 볼륨은" + vol+ " 입니다."); break;
				
				case 2 : System.out.println("볼륨을 1 내립니다");
				vol--; System.out.println("현재 볼륨은" + vol+ " 입니다."); break;
				}
			
					
				System.out.println("===========================");break;
				
			
		// 컴퓨터 스피커
		case 2 : System.out.println("컴퓨터 스피커 볼륨을 설정합니다."); 
				System.out.println("현재 볼륨은 " + vol + "입니다.");
				System.out.println("===========================");
				System.out.println("1.볼륨 UP | 2. 볼륨 Down");
				int num2 = scan.nextInt();
				switch (num2) {
		
				case 1 : System.out.println("볼륨을 1 올립니다");
				vol++; 
				System.out.println("현재 볼륨은" + vol+ " 입니다."); break;
		
			
				case 2 : System.out.println("볼륨을 1 내립니다");
				vol--; System.out.println("현재 볼륨은" + vol+ " 입니다."); break;
				}System.out.println("===========================");break;
		
		case 3 : System.out.println("이어폰 볼륨을 설정합니다.");
				System.out.println("현재 볼륨은 " + vol + "입니다.");
				System.out.println("===========================");
				System.out.println("1.볼륨 UP | 2. 볼륨 Down");
				int num3 = scan.nextInt();
				switch (num3) {

				case 1 : System.out.println("볼륨을 1 올립니다");
				vol++; 
				System.out.println("현재 볼륨은" + vol+ " 입니다."); break;
		
	
				case 2 : System.out.println("볼륨을 1 내립니다");
				vol--; System.out.println("현재 볼륨은" + vol+ " 입니다."); break;
				}System.out.println("===========================");break;
		
		
		default:System.out.println("다시 입력하세요"); break;
			
		}
		
			}
		
		
		
		
		
		
	}
}
