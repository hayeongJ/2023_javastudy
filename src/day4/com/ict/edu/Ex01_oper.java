package day4.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 -> 조건이 참일 때와 거짓일 때를 구분해서 실행한다.
		// 형식 > 자료형 변수 이름 = (조건식) ? 조건식이 참일 때 실행할 문장 : 조건식이 거짓일 때 실행할 문장;
		// 주의사항 : 변수, 참일 때 실행 결과와 거짓일 때 실행 결과 모두 같은 자료형이어야 한다.
		// 조건식에는 boolean(true, false), 비교 연산자, 논리 연산자
		
		String str =(false)? "강아지" : "고양이" ; // 형식은 맞춰야 함 > 지워버리면 안됨 
		// String str = (true) ? "강아지" : 10 ; >> 같은 자료형이어야 함 > 오류
		
		System.out.println("결과 : " + str);
		System.out.println("==================================");
		
		//int avg = 80;
		
		double avg = 55.3;
		str = (avg >=60)? "합격!" : "불합격!";
		
		System.out.println("결과 : " + str);		
		System.out.println("==================================");		
		
		// 논리 연산자 넣어보기
		
		char c1 = 'G';
		str = (c1 >= 'a' && c1 <= 'z') ? "소문자" : "소문자 X";
		
		System.out.println("결과 : " + str);
		System.out.println("==================================");
		
		
		// 1 또는 3이면 남자 아니면 여자
		int gender =1;
		str = (gender == 1 || gender == 3) ? "남자" : "여자";
		
		System.out.println("결과 : " + str);
		System.out.println("==================================");
		
		// 홀수이면 남자, 짝수이면 여자
		gender = 4;
		str = (gender %2 == 1) ? "남자" : "여자";
		
		System.out.println("결과 : " + str);
		System.out.println("==================================");	
		
		// 3의 배수인지 아닌지 알아보자.
		int su = 157;
		
		str = (su % 3 == 0) ? "3의 배수" : "3의 배수가 아님";
		System.out.println("결과 : " + str);
		System.out.println("==================================");
		
		
		// Q. 근무시간이 8시간까지는 시간 당 9620원이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다. >> 2시간 초과
		// 얼마를 받아야 하는가?
		
		int work = 8;
		int overwork =10;
		int pay = 9620;
		int overpay = (int) (1.5 * pay);
		int over_paypay = ((overwork -work)*overpay) + (work*pay);
		int money = (work*pay);
	
		int result =0;
		
		str = (overwork > 8) ? "초과!!!" : "초과 x";

		System.out.println(str);
		
		result = (overwork > 8)? (over_paypay) : money; 
		
		System.out.println("지급액 : " + result + "원");
		System.out.println("==================================");
		
		/* 선생님 답안
		 * int time = 10;
		 * int dan =9620;
		 * 
		 * int pay = (time > 8) ? (8*dan) + (int)((time -8)*dan*1.5)) : time * dan;
		 *  System.out.println("지급액 : " + pay + "원");
		 */
				
		int num1 = 47;
		int num2 = 32;
		int res = (num1 > num2) ? num1 : num2 ;
		
		System.out.println("큰 값 : " + res);
		System.out.println("==================================");
		
		int res2 = Math.max(num1, num2);
		System.out.println("큰 값 : " + res2);		
		System.out.println("==================================");
		
		// Math 클래스에 있는 메소드 10개 조사하기
		
		int res3 = -38;
		int res4 = (res3 > 0)? res3 : res3*-1 ;
		
		System.out.println("결과 : " + res4);	
		System.out.println("==================================");
		
		int res5 = Math.abs(res3);
		System.out.println("결과 : " + res5);	
		System.out.println("==================================");	
		
		
		
		
		
		
		
		
	}
}
