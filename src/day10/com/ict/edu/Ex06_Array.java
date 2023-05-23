package day10.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 입력받기
		// 학급 인원 수 받기, 인원수 만큼 돌리기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 : ");
		int num = scan.nextInt();
		
		String[] name = new String[num];
		int[] kor = new int [num];
		int[] eng = new int [num];
		int[] math = new int [num];
		int[] sum = new int[num];
		double[] avg = new double[num];
		String[] hak = new String[num];
		int[] rank = new int[num];
		
		
		for (int i = 0; i < num; i++) {
			System.out.println((i+1)+"번 학생 이름을 입력하세요");
			name[i] = scan.next();
			System.out.println((i+1)+"번 국어 점수 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println((i+1)+"번 영어 점수 입력하세요");
			eng [i] = scan.nextInt();
			System.out.println((i+1)+"번 수학 점수 입력하세요");
			math [i] = scan.nextInt();
		}
		
		//학점 구하기
		for (int i = 0; i < num; i++) {
			sum[i]=kor[i]+eng[i]+math[i];
			avg[i]=(int)(sum[i]/3.0*10)/10.0;
			if (avg[i]>=90) {
				hak[i]="A학점";
			} else if (avg[i]>=80) {
				hak[i]="B학점";
			} else if (avg[i]>=70) {
				hak[i]="C학점";
			} else {
				hak[i]="F학점";
			}
		}
		
		// sum으로 순위 구하기
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(sum[i]==sum[j]) continue;
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
			}
		}
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]+1);	
		}
		
		
	}
}
