package day3.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
		//증감연산자 : 해당 변수의 값을 1씩 증가나 감소를 시킨다.
		// ++ 변수 : 현재 변수 값을 먼저 1증가하고 나머지를 실행 
		// 변수 ++ : 현재 변수값으로 실행한 뒤 변수 값을 1 증가 시킴
		
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1);
		System.out.println(su2++); // 세미콜론 이후에 줄 바뀌면 증가된다.
		
		System.out.println(su1);
		System.out.println(su2);
		
		char c1 = 'b';
		char c2 = 'B';
		
		System.out.println(++c1);
		System.out.println(c2++);
		
		System.out.println(c1);
		System.out.println(c2);
		
		
	}
	
	
}
