package day5.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		// for문 :정해진 규칙에 따라 실행문을 반복 처리한다.
		// 형식) for(초기식; 조건식; 증감식){
		// 			조건식이 참일 때 실행할 문장;
		// 			조건식이 참일 때 실행할 문장;
		// 			조건식이 참일 때 실행할 문장;
		// 	}
		// ** for문을 만나면 무조건 초기식으로 이동
		// 	  초기식은 조건식으로 이동
		// 	  조건식이 참이면 for문 실행, 거짓이면 for문을 실행하지 X
		// 	  for문의 끝을 만나면 무조건 증감식으로 간다.
		
		// {}에서 만들어진 변수는 {}밖을 벗어나면 사라진다. (사용불가)
		
		// 안녕하세요를 열 번 출력하기.
		
		for (int i = 0; i < 11; i++) {
			System.out.println(i + "= 안녕하세요^0^");
		}
		System.out.println("=========================="); 
		// i가 1~10까지는 조건식 참이니까 for문 블럭 실행
		// i = 11 부터는 for문을 벗어난다.
		
		// ex02 ) 0부터 10까지 출력하기
		
		for (int i = 0; i < 11; i++) {
			System.out.print(i+" \n");
		}
		System.out.println("==========================");
		
		
		// ex 03) 0~10까지 짝수만 출력하기
		
		for (int i = 0; i<11; i=i+2) {
			System.out.println("결과 : " + i);
		}
		System.out.println("==========================");
		
		// + 0~10 까지 홀수만 출력한다면 i = 1 부터 시작한다. 
		
		// ex 04) 
		
		for (int i = 0; i < 11; i++) {
			if(i%2==0) {		// 홀수는 i%2==1
				System.out.print(i+"\n");
			}
		}
		System.out.println("==========================");
		
		// ex 05) 구구단 중 7단 출력
		
		for (int i = 1; i < 10; i++) {
				System.out.println("7 * "+ i + " = " + (7*i));
		}
		System.out.println("==========================");
		
		
		// ex 06) 1~10 누적합 출력하기 (합계 구하기)
		// 누적합 공식 : 이전 저장 = 이전 저장 + 현재 값; 
		// >> 이전 저장 변수 = 0
		// 누적곱 	   : 이전 저장 = 이전저장 * 현재 값 >> 초기값 =1이어야 함
		// >> 이전 저장 변수 = 1
		
		int sum =0; // for문 밖에서 써야하기 때문에 for문 밖에서 선언해주어야 함
		for (int i = 1; i < 11; i++) {
			sum = sum + i; // i의 누적합
		}
		System.out.println("누적합 = " + sum);
		System.out.println("==========================");
		
		// ex 07) 1~10 까지 짝수의 누적합 출력하기
		
		int sum2 =0;
		for (int i = 0; i < 11; i++) {
			if(i%2==0) {
				sum2 = sum2 +i;
			}
		}
		System.out.println("짝수의 누적합 : " + sum2);
		
		
		// ex 08) 7! (누적곱) 출력하기
		
		int mul = 1;
		for (int i = 1; i < 8; i++) {
			mul = mul * i;
		}
		System.out.println("7! = " + mul);
		System.out.println("==========================");
		
		/* 
		 int mul 1;
		 for (int =7; i>0; i--){
		 	mul = mul *i;
		 }
		 System.out.println ("7 ! =" + mul);
		 
		 */
		 
		// [숙제] 1+(-2)+3+(-4)+5+(-6)+7+(-8)+9+(-10) 
		// for문을 이용한 누적합 & if~else 사용
		
		int sum3 =0;
		for (int i = 0; i < 11; i++) {
			if (i%2==1) {
				sum3 = sum3 + i;
			} else {
				sum3 = sum3 + i*(-1);
			} 
		}System.out.println("합계는 ? " + sum3);
		
		
		
		
		
		
		
		
	}
}
