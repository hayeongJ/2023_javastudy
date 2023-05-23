package day6.com.ict.edu2;

import java.util.Scanner;

public class Ex_Homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// !과제!
		// 원하는 회수를 입력 받고 
		// 숫자를 입력 받아서 
		// 입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		
		System.out.print("횟수 입력 : ");
		int num = scan.nextInt();
		
		String mo = "";
		for (int k = 0; k < num; k++) {	
			if (num%2==0) {
				mo = "짝수";
			} else {
				mo = "홀수";
			}
			System.out.println();
			System.out.println("해당 횟수는 : " + mo  + "입니다.");
			System.out.println("===============================");
			
		}
		
		// 이름, 국어, 영어, 수학를 입력 받아서 
		// 총점, 평균, 학점을 구하고 
		// 이름, 총점, 평균, 학점을 출력하는 코딩 
		// (평균은 소숫점 첫째자리까지 구하자)
		
		
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		
		int sum = kor + eng + math;
		double avg = sum /3.0;
		double avg1 = (int)(avg*10)/10.0;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg1);
		
		
		
		// 첫번째 숫자 받기
		// 두번째 숫자 받기
		// 연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		//			1번 더하기 / 2번 빼기 / 3번 곱하기 / 4번 나누기
		//			> 결과 소숫점 나오게
		
		
		
	}
}
