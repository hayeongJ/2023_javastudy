package day9.com.ict.edu;
import java.util.Arrays;
import java.util.Collections;
public class Ex11_Array {
	public static void main(String[] args) {
		// 과제
		// double p1 : 번호,국어,영어,수학,총점,평균,학점(char),순위
		// double p2 : 번호,국어,영어,수학,총점,평균,학점(char),순위
		// double p3 : 번호,국어,영어,수학,총점,평균,학점(char),순위
		// 번호,총점,평균,학점,순위
		
		int[][] arr = new int[5][5];		
		int[] p1 = {1,270,90,'A',1};
		int[] p2 = {2,210,70,'C',1};
		int[] p3 = {3,180,60,'F',1};
		int[] p4 = {4,300,100,'A',1};
		int[] p5 = {5,285,95,'A',1};
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]=p4;
		arr[4]=p5;
		
		
		// 순위를 구하자 (총점)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][2]==arr[j][2]) continue;
				if (arr[i][2] < arr[j][2]) {
					arr[i][4]++;
				}
			}
		}
				
		// 1등이 위로 (순위 오름차순)
		int[][] tmp = new int[5][5];
		for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            // 비교하기 (오름 (i>j), 내림 (i<j) 때 자리 변경하자
	            if (arr[i][4] > arr[j][4]) {
	                tmp[i] = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp[i];
	            }
	        }
	    }
				
		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr.length; j++) {
				if (j==3) {
					System.out.print((char)arr[i][j]+"\t");
				} else {
					System.out.print(arr[i][j]+"\t");
				} 
			}
		}
		
		}
		
	}


