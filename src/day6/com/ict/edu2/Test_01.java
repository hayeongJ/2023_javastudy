package day6.com.ict.edu2;

public class Test_01 {
	public static void main(String[] args) {
	
		// 1번
		String name ="홍길동";
		int kor = 90;
		int eng = 85;
		int math = 85;
		int sum = kor+eng+math;
		double avg1 = sum/3.0;
		double avg2 = (int)(avg1*10)/10.0;
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg2 + "점");
		System.out.println();
		System.out.println("====================================");
		
		// 2번 저장할 것 받은 시간, 시, 분, 초, 나머지
		
		int time =3989;
		int hour, min, sec, res = 0;
		
		
		hour = time /(60*60);
		res = time %(60*60);
		min = res / 60;
		sec = res % 60;
		
		System.out.println(time + "초는 " + hour + "시간" + min + "분" + sec + "초 입니다.");
		System.out.println();
		System.out.println("====================================");
		
		
		// 3번
		
		int coffee = 8500;
		int p = 2;
		int money = 20000;
		int change = money - (int)(coffee*p*1.1);
		
		System.out.println("잔돈은 " + change + "원 입니다.");
		System.out.println();
		System.out.println("====================================");
		
		
		//4번
		
		int k1 = 51;
		
		String result = "";
		if (k1%2==0) {
			result = "짝수";
		} else if (k1%2==1) {
			result = "홀수";
		} 
		System.out.println("결과는 " + result + "입니다.");
		System.out.println();
		System.out.println("====================================");
		
		
		// 5번 if~else문으로 char k2가 대문자인지 소문자인지
		
		char k2 ='a';
		String res2="";
		
		if (k2 >='A' && k2<='Z') {
			res2 ="대문자";
		} else if (k2 >= 'a' && k2<= 'z') {
			res2="소문자";
		} 
		System.out.println("결과 : " + res2 + "입니다.");
		System.out.println();
		System.out.println("====================================");
	
		
		// 6번 if~else문으로 급여 계산
		
		int pay = 9620;
		int overpay = (int)(pay*1.5);
		int worktime = 10;
		int result2 = 0;
		
		if (worktime>8) {
			result2 = ((worktime-8)*overpay)+ pay*8;
		} else {
			result2= pay*8;
		}
		System.out.println("지급액 : " + result2 + "원");
		System.out.println();
		System.out.println("====================================");
		
		//
		
		
	
	}
		
}
	
	

	
	


