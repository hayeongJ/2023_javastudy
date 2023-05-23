package day6.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재 위치의 블록을 탈출하는 예약어(명령어)
		// continue : continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기 위해서 증감식으로 이동
		// 보통 if문과 함꼐 사용한다.
		// break는 for문과 while문 모두 사용, continue는 for문에만 사용한다.
		//								> while에도 사용은 가능함
		// 
		// 1부터 10까지 출력
		
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// 1~10 출력, 6일 때 break 사용
		for (int i = 0; i < 11; i++) {
			if(i==6)break;			// 조건을 만족하는 순간 break
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " "); // 6이 찍힌 상태에서 break여서 6도 출력된다.
			if(i==6)break;
		}
		System.out.println();
		System.out.println("=========================");
		
		
		
		// 1~10 출력, 6일 때 continue 사용
		
		for (int i = 0; i < 11; i++) {
			if(i==6)continue;			// 6일 때만 실행하지 않음
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " "); // 6이 찍힌 상태에서 break여서 6도 출력된다.
			if(i==6)continue;
		}
		System.out.println();
		System.out.println("=========================");
		
		
		// 0~10 까지 홀수만 출력하기. continue를 이용해서!
		
		for (int i = 0; i < 11; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println("=========================");
		
		
		for (int i = 0; i < 11; i++) {
			if (i%2==0)continue; // 짝수는 실행하지 않고 홀수만 실행
				System.out.println(i);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
