package day7.com.ict.edu2;

public class String_Ex {
	public static void main(String[] args) {
		
		
		// 이름의 첫자와 마지막자를 제외하고 * 찍기 
		
		String name = "가나다라";
		String res1 = "";
		int d1 = name.length();
		// String res1 = name.replace(name.charAt(1), '*');
		for (int j = 0; j < d1; j++) {
			char b = name.charAt(j);
			if (j==0 || j==d1-1) {
				res1 += b;
			} else {
				res1 +="*";
			}
			
			/*
			if (name.length()>3) {
				res1 = name.replace(name.charAt(2), '*');
				
			} else {
				res1 = name.replace(name.charAt(1), '*');
			}
			*/
		}
		System.out.println(res1);
		
		
		// 전화번호 010-1234-5678 => 010-1234-**** 과 010-****-5678
		
		String num ="010-1234-5678";
		int t1 = num.length();
		int t2 = num.lastIndexOf("-");
		String res="";
		for (int i = 0; i < t1; i++) {
			char s = num.charAt(i);
			if (i>=0 && i<=t2) {
				res += s;
			} else {
				res +="*";
			}
		}
		System.out.println("결과 : " + res);
		
		// 중간 *
		num ="010-1234-5678";
		t2 = num.length();
		int t3 = num.lastIndexOf("-");
		int t4 = num.lastIndexOf("-");
		res="";
		for (int i = 0; i < t2; i++) {
			char s = num.charAt(i);
			if (i>=t3+1 && i<=t4-1) {
				res += "*";
			} else {
				res += s;
			}
		}
		System.out.println("결과 : " + res);
		
		
		
		
		
		
		
		
		
		
	}
}
