package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
//		총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 
//		이름, 국어, 영어, 수학를 받아서 
//		총점, 평균, 학점, 순위를 구하고 
//		순위 기준으로 오름차순으로 정렬하여 
//		출력하는 main 메서드를 가지는 클래스를 만들어라 
//		단, 처리는 2차원배열을 이용해라
//	   이름 국어 영어  수학 총점  평균 학점 순위 
//		0	1	2	3	4	5	6	7	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 : ");
		int num = scan.nextInt();
		
		String[][]str = new String[num][2];
		int[][]a = new int[num][8];
		for (int i = 0; i < num; i++) {
			Ex06_method2 t = new Ex06_method2();
			System.out.print("이름 : ");
			t.name = scan.next();
			System.out.print("국어 점수 : ");
			t.kor= scan.nextInt();
			System.out.print("영어 점수 : ");
			t.eng = scan.nextInt();
			System.out.print("수학 점수 : ");
			t.math= scan.nextInt();
			
			t.getSum(t.kor, t.eng, t.math);
			t.getAvg();
			t.getHak();
			
			str[i][0]=t.name;
			str[i][1]=t.hak;
			a[i][4]= t.sum;
			a[i][5]= (int)t.avg;
			a[i][7] = 1;
			}
		// 순위 구하기
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i][4]<a[j][4]) {
					a[i][7]++;
				}
			}
		}
		// 순위로 오름차순
		int [][] tmp = new int[num][8];
	    for (int i = 0; i < a.length-1; i++) {
	    	for(int j=i+1;j<a.length; j++) {
	    		if(a[i][7]>a[j][7]) {
	    			tmp[i]=a[i];
	    			a[i]=a[j];
	    			a[j]=tmp[i];
	    		}
	    	}
	    }
		
		// 출력하기
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			System.out.print(str[i][0] +"\t");
			System.out.print(a[i][4]+"\t");
			System.out.print(a[i][5]+"\t");
			System.out.print(str[i][1]+"\t");
			System.out.print((int)a[i][7]+"\t");
			System.out.println();
		}
		System.out.println();
		
		
	}
}