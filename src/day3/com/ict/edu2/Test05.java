package day3.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		int su = 3781;
		
		// 결과
		// 천의 자리 : 3;
		// 백의 자리 : 7;
		// 십의 자리 : 8;
		// 일의 자리 : 1;
		
		int thou = su % 10000/1000; 
		int hun = su % 1000/100;
		int ten = su % 100 /10;
		int one = su % 10;
		
		
		System.out.println("천의 자리 : " +thou);
		System.out.println("백의 자리 : " + hun);
		System.out.println("십의 자리 : "+ten);
		System.out.println("일의 자리 : "+one);
		
		
		// int c = 0;
		// int b = 0;
		// int s = 0;
		// int i = 0;
		// int res = 0;
		
		// c = su/1000; >> 3
		// res = su%1000; >> 781
		
		// b = res/100; >> 7
		// res = res%100; >> 81
		
		// s = res/10; >> 8
		
		// i = res%10;
		
		// System.out.println("천의 자리 : " +c);
		// System.out.println("백의 자리 : " +b);
		// System.out.println("십의 자리 : " +s);
		// System.out.println("일의 자리 : " +i);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
