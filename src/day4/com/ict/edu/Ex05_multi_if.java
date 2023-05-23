package day4.com.ict.edu;

public class Ex05_multi_if {
	// 클래스 바로 밑에 String kkkk; >> 전역변수 : 모든 구간에 사용 가능
	public static void main(String[] args) {
		// 다중 if문 
		// 형식) if(조건식1){
		//			조건식1이 참일 때 실행할 문장;
		//			조건식1이 참일 때 실행할 문장;
		//	}
		// else if(조건식2){
		//			조건식1이 거짓이면서 조건식2가 참일 때 실행할 문장;
		//			조건식1이 거짓이면서 조건식2가 참일 때 실행할 문장;	
		//	}
		// else if(조건식3) {
		//			조건식1,2가 거짓이면서 조건식3이 참일 때 실행할 문장;
		//			조건식1,2가 거짓이면서 조건식3이 참일 때 실행할 문장;
		//	}
		// else {
		//			조건식1,2,3이 모두 거짓인 경우;
		//}
		
		// int k1의 점수가 90점 이상이면 A학점, 80점 이상이면 B학점, 70점 이상이면 C학점, 나머지는 F학점
		
		int k1 = 55;
		String str = "";
		if (k1 >=90) {
			str ="A학점";
		} 
		else if (k1>=80) {
			str ="B학점";
		} 
		else if (k1>=70) {
			str ="C학점";
		} 
		else {
			str = "F학점";
		}{
		}{
		}
		System.out.println("학점 : " + str);
		System.out.println("==============================");
		
		// char k2가 대문자인지 소문자인지 숫자인지 기타문자인지 판별하자.
		
		char k2 = 0;
		str ="";
		// 숫자 ???
		
		if (k2>='A' && k2<='Z') {
			str = "대문자입니다!";
		} else if (k2 >='a' && k2<='z') {
			str = "소문자입니다!";
		} else if (k2>=0 && k2 <=127) { // 숫자 범위 '0' 부터 '9'
			str = "숫자입니다!"; // 이따가
		} else {
			str = "기타문자입니다!";
		}{

		}{

		}
		System.out.println("어떤 문자? :" + str);
		System.out.println("==============================");
		
		
		// char k3이 A,a 이면 아프리카, B,b 이면 브라질, C,c 이면 캐나다, 나머지는 한국.
		
		char k3 = 'a';
		str ="";
		if (k3 == 'A'|| k3 =='a') {
			str = "아프리카";
		} 
		else if (k3 == 'B' || k3 == 'b') {
			str = "브라질";
		} 
		else if (k3 == 'C' || k3 =='c') {
			str = "캐나다";
		} else {
			str = "!한국!";
		}{

		}{

		}
		System.out.println("나라 : " + str);
		System.out.println("==============================");
		
		
	
		// menu가 1이면 카페모카 3500원, 2이면 카페라떼 4000원, 3이면 아메리카노 3000원,
		// 4이면 과일쥬스 3500원이다. 친구와 2잔을 10000원 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능.
		
		int menu = 4;
		int mocha = 3500;
		int latte = 4000;
		int ame = 3000;
		int juice = 3500;
	
		int money = 10000;
		int result =0;
		
		int total =2;
		str ="";
		
		if (menu ==1) {
			str = "카페모카";
			result = money -(int) ((mocha*total)*1.1);

		} 
		else if (menu ==2) {
			str = "카페라떼";
			result = money -(int) ((latte*total)*1.1);

		} 
		else if (menu ==3) {
			str = "아메리카노";
			result = money -(int) ((ame*total)*1.1);

		} 
		else if (menu ==4) {
			str = "과일쥬스";
			result = money -(int) ((juice*total)*1.1);
		} else {
			System.out.println("주문 X");
		}{

		} {

		}{

		}
		System.out.println(str + " 주문하였습니다.>>" + " 잔돈은 " + result + "원 입니다.");
		
		// 선생님 답
		int menumenu = 3;
		int in = 10000;
		int su = 2;
		int dan = 3500;
		String drink ="";
		
		if (menu ==1) { // 블록 안에 선언한 내용은 밖을 벗어나면 사라짐.
			drink = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			drink = "과일주스";
			dan = 3500;
		} else {

		}{

		}{

		}{

		}
		int to = dan * su;
		int vat = (int)(to *0.1);
		int out = in - (to+vat);
		
		System.out.println(drink + " 주문 > 잔돈은 " + out + "원 입니다." );
		
	}
}
