package day13.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		/* 2번
		 1 0 0 0
		 0 1 0 0 
		 0 0 1 0
		 0 0 0 1
		*/
		for (int i = 0; i <4 ; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				if (i==j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
		} System.out.println();
		System.out.println("==============================");
		
		
		// 3번
		// 빈칸 채우기
	
		
		
		// 1번
		int[] su = {3,4,9,8,2,1,7,10,5,6};
		
		int tmp = 0;
		
		for (int i = 0; i < su.length -1; i++) {	// 나
			for (int j = i+1; j < su.length; j++) {	// 비교대상
				if(su[i]<su[j]) {
				tmp = su[i];
				su[i]=su[j];
				su[j]=tmp;
			}
		}
	}
		
		// 2번 (정렬 및 출력하지 않아도 됨)
		int[] su3= {90,80,70,95,90,85,75};
		int[] rank = {1, 1, 1, 1, 1, 1, 1};
		for (int i = 0; i < su3.length; i++) {
			for (int j = 0; j < su3.length; j++) {
				if (su3[i]==su[j]) continue;
				if (su3[i]<su3[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i]+" ");
		}
		System.out.println();
		
		
		// 3번
		int[] su1 = {90,87,-20,120,67,23,40,53}	;
		Arrays.sort(su1);
		
		System.out.println("가장 작은 값 : "+ su1[0]);
		System.out.println("가장 큰 값 : "+ su1[su.length]);
		
		
		
		//4번
		int[][] su5 = new int[3][];
		
		int[] g1 = {10,20,30};
		int[] g2 = {100,200};
		int[] g3 = {1000,2000,3000,4000};
		
		su5[0] = g1;
		su5[1] = g2;
		su5[2] = g3;
		
		for (int i = 0; i < su5.length; i++) {
			for (int j = 0; j < su5[i].length; j++) {
				System.out.println(su5[i][j]);
			}
		}
		System.out.println("==================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
