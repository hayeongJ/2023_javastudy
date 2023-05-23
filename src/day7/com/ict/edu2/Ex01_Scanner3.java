package day7.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// 계속할까요(1.yes, 2.no)일 때 Ex01_Scanner2는 숫자로 받았는데
		// 문자가 들어오면 오류 발생 된다
		// 그래서 문자로 받아서 처리하자
		Scanner scan = new Scanner(System.in);
		 int count = 0;
	     int even = 0;
	        esc:
	        while (count >= 0) {
	            count++;
	            System.out.print("숫자입력 : ");
	            int su1 = scan.nextInt();
	            String str = "";
	            if (su1 % 2 == 0) {
	                str = "짝수";
	                even++; // z++;
	            } else {
	                str = "홀수";
	            }
	            System.out.println(su1 + "는 " + str + "입니다.");
	            while(true) {
	            System.out.print("계속할까요?(1.yes, 2.no) >>");
	            String s1 = scan.next();
	            if(s1.equalsIgnoreCase("y")){
	                continue esc;
	            }
	            else if (s1.equalsIgnoreCase("n")) {
	                break esc ;
	            }else {
	                System.out.println("다시 입력하세요");
	                continue ;
	            }

	        }
	        }
	        double pug = (int) ((even * 1.0 / count) * 100 * 10) / 10.0;
	        System.out.println("전체횟수 : " + count);
	        System.out.println("짝수횟수 : " + even);
	        System.out.println("짝수 퍼센트 : " + pug + "% 입니다.");
	}
}
