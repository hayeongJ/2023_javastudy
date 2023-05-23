package day3.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇 시간, 몇 분, 몇 초 인가?
		
		int time = 3989;
		
		int hour = time / (60*60);
		int min = time/60 - hour*60;
		int sec = time %60;
		
		System.out.println(hour + "시간"+ min +"분" + sec + "초");
		
		// int time = 3989;
		// int hour = 0;
		// int min = 0;
		// int sec = 0; >> 미리 저장해두기
		// int res = 0; >> 나머지
		
		
		// hour = time/(60*60); >> 1
		// res = time%(60*60); >> 나머지 구하기 >> 389
		// min = res/60; >> 분
		// sec = res%60; >> 초
		
	}
}
