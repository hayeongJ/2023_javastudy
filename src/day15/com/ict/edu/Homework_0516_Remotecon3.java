package day15.com.ict.edu;

import java.util.Scanner;

public class Homework_0516_Remotecon3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 장치 선택하기
		int vol = 3;
		while(true) {
			System.out.println("======= 장치를 선택하세요 =======");
			System.out.println("1. TV | 2. 컴퓨터 스피커 | 3. 이어폰");
			int su = scan.nextInt();		// 장치 선택하기
			System.out.println();
			switch(su) {
			case 1 : System.out.println("TV 볼륨을 설정합니다.");
					System.out.println("현재 볼륨은" + vol + " 입니다."); break;
					
			case 2: System.out.println("컴퓨터 스피커 볼륨을 설정합니다.");
			System.out.println("현재 볼륨은 " + vol + " 입니다."); break;
			
			case 3: System.out.println("이어폰 볼륨을 설정합니다.");
			System.out.println("현재 볼륨은 " + vol + " 입니다."); break;
			 default : System.out.println("다시 입력하세요"); break;
			}
		
		// 볼륨 설정하기
		esc2:
			while(true) {
				System.out.println("======= 볼륨을 설정합니다 ======="); 
				System.out.println("1. 볼륨 up | 2. 볼륨 down | 3. 종료");
				int num = scan.nextInt();
				
				switch(num) {
				case 1 : vol++; 
					System.out.println("현재 볼륨은 "+vol+"입니다.");break;
				case 2 : vol--;
				 	System.out.println("현재 볼륨은 "+vol+"입니다."); break;
				case 3 :System.out.println("종료합니다."); 
					vol=vol;
					break esc2;
				
				 default : System.out.println("다시 입력하세요"); break esc2;
					 }
				if(vol<0 || vol>10) {
					 System.out.println("볼륨 설정이 불가합니다.");
				}
				
			}
		}
		
	}
}
