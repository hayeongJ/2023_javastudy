package day13.com.ict.edu;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		
		//2번
		int[] su = {90,80,70,95,90,85,75};
		int[] rank = {1,1,1,1,1,1,1};
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(su[i]==su[j])continue;
				if(su[i]<su[j]) {rank[i]++;}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i]+" ");
		}
		System.out.println();
		
		
		//3번
		int[] su1 = {90,87,-20,120,67,23,40,53}	;
		Arrays.sort(su1);
		
		System.out.println("가장 작은 값 : "+ su1[0]);
		System.out.println("가장 큰 값 : "+ su1[su.length]);
		
	}
}
