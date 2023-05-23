package day12com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08_constructor coffee = new Ex08_constructor("커피음료", 1000);
		Ex08_constructor ion = new Ex08_constructor("이온음료", 1500);
		Ex08_constructor cola = new Ex08_constructor("탄산음료", 1200);
		Ex08_constructor juice = new Ex08_constructor("과일음료", 1800);
		
		Ex08_constructor[] arr = {coffee,ion,cola,juice};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 투입하세요 : ");
		
		
	}
}
