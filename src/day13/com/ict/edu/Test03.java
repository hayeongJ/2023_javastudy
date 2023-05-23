package day13.com.ict.edu;

public class Test03 {
	public static void main(String[] args) {
		int[][] su = new int[3][];
		
		int[] g1 = {10,20,30};
		int[] g2 = {100,200};
		int[] g3 = {1000,2000,3000,4000};
		
		su[0] = g1;
		su[1] = g2;
		su[2] = g3;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println("==================================");
	}
}
