package day7.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("숫자 입력 : ");
		int su = scan.nextInt();
		
		String str ="";
		if (su%2==0) {
			str="짝수";
		} else {
			str="홀수";
		}
		System.out.println(su + "는 " + str + "입니다.");
		*/
		
		// 횟수가 정해져 있지 않을 때 => while(true)
		/*
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			
			String str ="";
			if (su%2==0) {
				str="짝수";
			} else {
				str="홀수";
			}
			System.out.println(su + "는 " + str + "입니다.");
			System.out.println("계속할까요? [1.yes / 2.no]");
			int s1=scan.nextInt();
			if(s1==2)break;
		
		}
		*/
		
		//!과제! [0503 과제] - 제출 0504까지
		//1,2를 제외한 다른 숫자를 눌렀을 때 "다시 입력하세요." 나오게
		/*
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			
			String str ="";
			if (su%2==0) {
				str="짝수";
			} else {
				str="홀수";
			}
			System.out.println(su + "는 " + str + "입니다.");
			System.out.println("계속할까요? [1.yes / 2.no]");
			int s1=scan.nextInt();
			if (s1==2) {
				break;
			}else if (s1>2||s1==0) {
				System.out.println("다시 입력하세요.");
			}
		}
		System.out.println("========================");
		*/
		
		// 전체 횟수, 짝수 횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째자리까지 구하자)
		// 짝수 확률 = 짝수 횟수/전체 횟수 
		
		
		int od=0; // 홀수
		int even=0; //짝수
		double count =0;
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			
			String str ="";
			if (su%2==0) {
				str="짝수";
				even=even+1;
			} else {
				str="홀수";
				od=od+1;
			}
			System.out.println(su + "는 " + str + "입니다.");
			System.out.println("계속할까요? [1.yes / 2.no]");
			int s1=scan.nextInt();
			if (s1>2||s1==0) {
				System.out.println("다시 입력하세요.");
			}
			
			else if (s1==2) {
				int sum = even + od;
				count = (int)(((even*1.0)/(double)sum*100)*10) / 10.0;
				System.out.println("전체횟수 : "+ sum);
				System.out.println("짝수횟수 : "+ even);
				System.out.println("짝수확률 : "+ count + "%");
			
				break;
		}
	}
	}
}
