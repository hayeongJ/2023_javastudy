package day4.com.ict.edu;

public class Ex04_if_else {
	public static void main(String[] args) {
		// if ~else 문 : 조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
		// 형식) if(조건식){
		//			조건식이 참일 때 실행할 문장;
		//			조건식이 참일 때 실행할 문장;
		//		} else {
		//			조건식이 거짓일 때 실행할 문장;
		//			조건식이 거짓일 때 실행할 문장;
		//		}
		
		// int k1 이 60이상이면 합격 아니면 불합격	
		int k1 = 79;
		String str = "";
		if (k1 >= 60) {
			str ="합격";
		} else {
			str ="불합격";
		}
		System.out.println("결과 : " + str);
		System.out.println("===============================");
		
		// int k2 가 홀수인지 짝수인지 판별하자.
		int k2 = 26;
		str = "";
		if (k2 %2 == 1) {
			str = "홀수";
		} else {
			str = "짝수";
		}
		System.out.println("k2는? : " + str);
		System.out.println("===============================");
		
		// char k3가 대문자인지 대문자가 아닌지 판별하자.
		char k3 = 'H';
		str ="";
		if (k3 >= 'A' && k3 <= 'Z') {
			str = "대문자입니다.";
		} else {
			str ="대문자가 아닙니다.";
		}
		System.out.println("k3는? : " + str);
		System.out.println("===============================");
		
		
	
		// Q. 근무시간이 8시간까지는 시간 당 9620원이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다. >> 2시간 초과
		// 얼마를 받아야 하는가?
		
		int pay =9620;
		int overpay = (int)(pay*1.5);
		int worktime = 10;
		int time = 8;
		int result = pay*8;
		
		if (worktime > time) {
			System.out.println("!!!초과입니다!!!");
			result = ((worktime-time))*overpay + (time*pay);
		} else {
		
			result = (time*pay);
		}
		System.out.println("지급액: " + result + "원");
		System.out.println("===============================");
				
		
	}
}
