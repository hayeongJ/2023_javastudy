package day4.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일 때만 실행, 거짓일 땐 if문 무시
		// 형식 1) if(조건식){
		//			조건식이 참일 때 실행할 문장;
		//			조건식이 참일 때 실행할 문장;
		//		}
		//	단, 실행 문장이 한 줄이면 {}을 생략할 수 있다.
		
		// 형식 2) if(조건식)
		// 			조건식이 참일 때 실행할 문장;
		// 또는
		//		 if(조건식) 조건식이 참일 때 실행할 문장; >> 한 줄로도 쓸 수 있다.
		
		// int k1 >=60 이상이면 합격
		
		int k1 = 50;
		String res = "초기값"; // 초기값 안넣으면 오류나는 경우도 있음
		if (k1 >= 60) {
			res = "합격"; // 조건식이 거짓이면 실행하지 않고 기존 저장된 값으로 출력함
		}
		if (k1 <60) {
			res = "불합격";
		}
		
		System.out.println("결과 : " + res);
		System.out.println("===============================");
		
		// int k2가 홀수인지 짝수인지 판별하자.
		
		int k2 = 43;
		
		res = "짝수";
		if (k2 %2 == 1) {
			res = "홀수";
		}
		System.out.println("결과 : " + res);
		System.out.println("===============================");
		
		// char k3가 대문자인지 아닌지 판별하자.
		
		char k3 = 'G';
		res = "!대문자 아님!";
		if (k3 >= 'A' && k3 <= 'Z') {
			res = "대문자";
		}
		System.out.println("결과 : " + res);
		System.out.println("===============================");
		
		// Q. 근무시간이 8시간까지는 시간 당 9620원이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다. >> 2시간 초과
		// 얼마를 받아야 하는가?
		
		int pay = 9620;
		int overpay = (int)(pay*1.5);
		int worktime = 10;
		int time = 8;
		int result = pay*8 ;
		
		if (worktime > time) {
			result = ((worktime-time)*overpay) + (8*pay);
		}
		
		System.out.println("지급액 : " + result + "원");
		System.out.println("===============================");
		
		
		
		
		
		
		
		
		
		
	}
}
