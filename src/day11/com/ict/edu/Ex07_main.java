package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
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
		
		Ex07_method t1 = new Ex07_method(); 
		
		for (int i = 0; i < hak.length; i++) {
			System.out.print("이름 : ");
			name[i]=scan.next();
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 : ");
			math[i]=scan.nextInt();
			
		t1.getSum(kor[i], eng[i], math[i]);	
		sum[i]=t1.sum;
		t1.getAvg(sum[i]);
		avg[i]=t1.avg;
		t1.getHak();
		hak[i]=t1.hak;
		
		}
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.println(hak[i]);
		}
	}
}
