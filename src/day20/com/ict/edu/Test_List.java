package day20.com.ict.edu;

import java.util.ArrayList;

public class Test_List {
	public static void main(String[] args) {
		// Array 객체 생성
		ArrayList<String> list = new ArrayList<>();
		
		// ArrayList 객체에 손흥민, 이강인, 김민재, 차범근 추가
		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add("차범근");
		
		// "손흥민" 포함되어있으면
		if(list.contains("손흥민")) {
			// 손흥민이 몇 번째 위치에 있는지 출력
			System.out.println(list.indexOf("손흥민"));
		}
		// ArrayList 항목 하나씩 다 출력
		System.out.println(list);
	}
}
