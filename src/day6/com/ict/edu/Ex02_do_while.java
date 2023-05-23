package day6.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
		// do~while 문 : while문과 같은 반복문
		// 				단, 먼저 실행 후 조건식이 붙는다.
		// 형식) 초기식;
		//		do {
		//			실행문;
		//			증감식;
		//		  } while(조건식);
		
		
		// 0부터 10까지 출력
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		System.out.println();
		System.out.println("========================");
		
		// 0부터 10까지 홀수만 출력
		
		i = 0;
		do {
			if (i%2==1) {
				System.out.println("i = " + i);
			}
			i++;
		} while (i<11);
		System.out.println("========================");
		
		
		// 7단 출력
		
		int a = 1;
		do {
			System.out.println("7 * " + a + " = " + 7*a);
			a++;
		} while (a<10);
		System.out.println("========================");
		
		
		
		// 0부터 10까지 홀수의 누적합
		
		
		int sum = 0;
		int b = 0;
		do {
			sum = sum + b;
			b++;
		} while (b<11);
		System.out.println("누적합 = " + sum);
		
		
		
		
		
		
		
		
		
	}
}
