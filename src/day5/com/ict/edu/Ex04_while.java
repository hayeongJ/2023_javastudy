package day5.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		// while 문 : for문과 같은 반복문
		// 형식 1)
		// 초기식;
		// while(조건식){
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식;
		// }
		// while문의 끝을 만나면 조건식으로 간다. >> for문은 for문의 끝을 만나면 증감식으로 이동.

		// 형식 2)
		// 초기식;
		// while(true){
		// if(빠져나갈 조건) {
		// break;
		// }
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식;
		// }
		// while문의 끝을 만나면 조건식으로 간다. >> for문은 for문의 끝을 만나면 증감식으로 이동.

		// ex 01) 1 ~ 10까지 출력하자.

		int i = 1;
		while (i < 11) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("=============================");

		/*
		 * i =1; while (true) { if(i>=11) break; system.out.println("i = " + i); i++; }
		 */

		// ex 02) 0 ~ 10까지 짝수만 출력하기.

		i = 0;
		while (i < 11) {
			if (i % 2 == 0) {
				System.out.println("i = " + i);
			}
			i++;
		}
		System.out.println("=============================");

		// ex 03)구구단 중 7단 출력

		int a = 1;
		while (a < 10) {
			System.out.println("7 * " + a + " = " + 7 * a);
			a++;
		}
		System.out.println("=============================");

		// ex 04) 1 ~ 10 누적합

		int sum = 0;
		int b = 1;
		while (b < 11) {
			sum = sum + b;
			b++;
		}
		System.out.println("누적합 = " + sum);
		System.out.println("=============================");

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		int num = 1;
		while (num < 5) {
			int c = 1;
			while (c < 5) {
				System.out.print("0" + " ");
				c++;
			}
			System.out.println();
			num++;
		}
		System.out.println("=============================");
		
		// 방법 2
		int num2 =1;
		while(num2<5) {
			System.out.println("0 0 0 0");
			num2++;
		}
		System.out.println();
		
		System.out.println("=============================");
		
		
		// 번외 > 9*9 별 찍기

		int n = 1;
		while (n < 10) {
			int c = 1;
			while (c < 10) {
				if (c % 2 == 0) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}

				c++;
			}System.out.println();
			n++;
		}
		
	
		// 번외 ★★★★
		//		★★★
	    //    	 ★★
		//	      ★

		i = 1;
		while (i<17) {
			System.out.println("0 ");
			if(i%4==0) {
				System.out.println();
			}
				
		}
		
		
		
	}

}
