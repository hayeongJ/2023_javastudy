package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_T {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String>map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		esc:
		while(true) {
			System.out.println("나라입력 : ");
			String str = scan.next();
			if (condition) {
				
			} else {
				System.out.println("데이터에 없는 나라입니다.");
			}
			while(true) {
				System.out.println("계속할까요?(y/n)");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {continue;}
			}
		}
	}
}
