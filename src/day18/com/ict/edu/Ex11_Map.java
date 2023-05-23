package day18.com.ict.edu;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 hashmap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		Scanner scan = new Scanner(System.in);
		
		esc:
		while(true) {
			System.out.println("나라 이름을 입력하세요 : ");
			String country = scan.next();
			String sudo = map.get(country);
			
				if(map.containsKey(country)) {
					System.out.println(sudo);
				}else{
					System.out.println("다시 입력하세요!");
					}
			
				
				while(true) {
					System.out.println("계속 하시겠습니까? (1) y | (2) n");
					String num = scan.next();
					if (num.equalsIgnoreCase("y")) {
						continue esc;
					}else if(num.equalsIgnoreCase("n")) {
						System.out.println("종료합니다.");
						break esc;
					}else {
						System.out.println("다시 입력하세요!");
						continue;
					}
				}
			}
		}
			
		
}
