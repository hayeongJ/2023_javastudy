package day3.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		// 2시간 40분 30초는 몇 초 일까요?
		
		int hour = 2 * 60;
		int min = (hour+40)*60;
		int sec = min +30;
		
		System.out.println("2시간 40분 30초는 " + sec + "초");
		
		
		// int hour = 2*60*60;
		// int min = 40*60;
		// int sec = 30;
		
		// System.out.println("2시간 40분 30초는 " + sec + "초 입니다.");
		
		
	}
}
