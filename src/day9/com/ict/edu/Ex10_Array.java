package day9.com.ict.edu;

public class Ex10_Array {
	public static void main(String[] args) {
		// 가변 길이
		int[][] su = new int [3][];
		
		// int[][] su2 = new int[][];
		// int[][] su3 = new int[][4];
		
		/* 초기 값을 고정길이 방식으로 주면 안됨(오류 발생)
		su[0][0]=10;
		su[0][1]=20;
		
		su[1][0]=100;
		su[1][1]=200;
		
		su[2][0]=1000;
		su[2][1]=2000;
		*/
		
		// 가변 길이는 무조건 1차원 배열을 만들어서 넣어야 한다.
		int[] k1 = {10,20,30};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000,3000,4000};
		
		// 위에서 만든 배열을 다차원 배열에 넣어라
		su[0]=k1;
		su[1]=k2;
		su[2]=k3;
		
		//출력
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
		// 선언, 생성, 저장 한 번에
		String[][]str = {{"java","자바","JAVA"},{"JSP"},{"HTML","CSS"}};
		
		// 출력
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				System.out.println(str[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
