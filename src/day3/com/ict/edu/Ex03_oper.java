package day3.com.ict.edu;

public class Ex03_oper {
	public static void main(String[] args) {
		// 비교 연산자  >, <, >=, <=, ==(같다), !=(같지 않다=다르다)
		// 비교 연산자를 사용하는 자료형은 문자, 정수, 실수
		// 연산 결과는 무조건 boolean으로 나오므로 boolean으로 결과를 저장! 
		
		int su1 = 90;
		int su2 = 80;
		
		boolean res = su1 >= su2; //int와 int 비교
		System.out.println(res);
		
		double su3 =89.999;
		double su4 =80.0;
				
		res = su1 >= su3; //int와 double 비교 -> 실제 값 비교라서 상관 없다.
		System.out.println(res);
		
		res = su2 == su4;
		System.out.println(res);
		
		char c1 = 'a'; //97로 기억하고 있기 때문에 비교가 가능하다.
		char c2 = 'A';
		
		res = su1 >= c1;
		System.out.println(res);
		
		res = c1 >= c2;
		System.out.println(res);
	
		
	}
}
