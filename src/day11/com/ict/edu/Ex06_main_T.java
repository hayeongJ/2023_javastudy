package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main_T {
	public static void main(String[] args) {
		//5명의 이름, 국어, 영어, 수학 점수를 입력받아서
		// 이름, 총점, 평균, 학점 구하고
		// 순위와 정렬은 main에서 할 것
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[]kor = new int[5];
		int[]eng = new int[5];
		int[]math = new int[5];
		int[]sum = new int[5];
		double[] avg = new double[5];
		String[]hak = new String[5];
		
		Ex06_method t1 = new Ex06_method();
		
		for (int i = 0; i < hak.length; i++) {
			System.out.print("이름 : ");
			name[i]=scan.next();
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 : ");
			math[i]=scan.nextInt();
			
			
			sum[i] = t1.getSum(kor[i], eng[i], math[i]);
			avg[i] = t1.getAvg(sum[i]);
			hak[i] = t1.getHak(avg[i]);
		}
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.println(hak[i]);
		}
		
		
	}
}
