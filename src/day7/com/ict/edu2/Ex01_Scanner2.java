package day7.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ex01_Scanner 클래스는 계속할까요? 질문했을 때 2이면 탈출하지만
		// 2를 제외한 나머지는 무조건 다시 실행하게 되는 단점이 있다.
		
		 int i = 0;
	     int z = 0;
	        esc:
	        while (i >= 0) {
	            i++;
	            System.out.print("숫자입력 : ");
	            int su1 = scan.nextInt();
	            String str = "";
	            if (su1 % 2 == 0) {
	                str = "짝수";
	                z = z + 1; // z++;
	            } else {
	                str = "홀수";
	            }
	            System.out.println(su1 + "는 " + str + "입니다.");
	            while(true) {
	            System.out.print("계속할까요?(1.yes, 2.no) >>");
	            int s2 = scan.nextInt();
	            if(s2 == 1) {
	                continue esc;
	            }
	            else if (s2 == 2) {
	                break esc ;
	            }else {
	                System.out.println("다시 입력하세요");
	                continue ;
	            }

	        }
	        }
	        double pug = (int) ((z * 1.0 / i) * 100 * 10) / 10.0;
	        System.out.println("전체횟수 : " + i);
	        System.out.println("짝수횟수 : " + z);
	        System.out.println("짝수 퍼센트 : " + pug + "% 입니다.");
	}
		

}

