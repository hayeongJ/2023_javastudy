package day3.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		// 카페모카가 6500원
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가? (단, 부가세 10%포함)
		
		int coffee = 6500;
		int money = 15000;
		
		int vat = (int)(coffee*2 * 0.1);
	
		
		int change = (money -((coffee*2)+ vat ));
		
		System.out.println("잔돈 : " + change + "원");
		
		
		
		// String coffee = "카페모카";
		// int dan = 6500;
		// int su = 2;
		// int in = 15000;
		
		// 부가세를 구하기 위해서 총 금액을 구하자.
		// int total = dan * su;
		// int vat = total/10;
	
		// int out = in - (total+vat);
		// system.out.println("잔돈 : " + out + "원");
		
		// 위 정보를 한 번에 처리
		// int out2 = in - (int)(total*1.1);
		
		
		
		
		
		
		
		
	}
}
