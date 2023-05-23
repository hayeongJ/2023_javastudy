package day5.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		// 중첩 for문 : for문 안에 또 다른 for문이 존재한다.
		
		for (int i = 1; i < 4; i++) {
			System.out.println("실행문 -1");
			for (int j = 1; j < 6; j++) { // 1부터 5까지 돌아야 위의 for문 1번
				System.out.println("i = " + i + ", j = " + j);
			} // 안쪽 for문 끝
			System.out.println("실행문 -1");
		}// 바깥쪽 for문 끝
		System.out.println("==================================");
		
		// 구구단 1)
		
		for (int i = 2; i < 10; i++) {
			System.out.println("### " + i + " 단 ### ");
			for (int j = 1; j < 10; j++) {
				 System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		
		// 구구단 2)단마다 가로로 출력하기 2단 3단 4단 ... 
		for (int i = 2; i < 10; i++) {
			
			System.out.println();
			for (int j = 1; j < 10; j++) {
				 System.out.print(i + " * " + j + " = " + i*j + "   ");
				 
			}
			System.out.println();
		}
		System.out.println("==================================");
		
		
		
		// 구구단 3)단을 세로로 출력하기
		for (int i = 1; i < 10; i++) {
			System.out.print("\n");
			for (int j = 2; j < 10; j++) {
				 System.out.print(j + " * " + i + " = " + i*j + "      ");
				 
			}	
			System.out.println();
		}
		System.out.println("==================================");
		
		
		// 다음 과제 별찍기
		
		
		
		
		
		
	}
}
