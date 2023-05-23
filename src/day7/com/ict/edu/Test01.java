package day7.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		// ### 1번 ### 
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 
		// for 문을 이용한 누적합 출력하기
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i%2==0) {
				sum = sum + i*(-1) ;
			} else {
				sum = sum + i ;
			}
		}
		System.out.println("결과 : " + sum);
		System.out.println("============================");
		
		// [2]
		// if ~ else문
		// 농구공 5개씩 한 박스에 들어간다. 40개면 8상자, 26개면 6상자이다. 
		// >> 페이징 기법에서 중요 
		// int k1 = 127 이다. 몇 상자가 필요할까?
		
		int k1 =127;
		int res =k1/5;
		if(k1%5 != 0) {
			res = res + 1;	
		}
		System.out.println("결과 : " + res);
		System.out.println("============================");
		
		
		// [3]
		// for문으로 풀기
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		for (int j = 0; j < 4; j++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("============================");
		
	
		// [3]-2
		// for문으로 풀기
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int k = 1; k < 17; k++) {
			System.out.print("0 ");
			if (k%4==0) {
				System.out.println();
			}
		}
		System.out.println("============================");
		
		// [4]
		// 이중 for문으로 풀기
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1	
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i==j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			} 
			System.out.println();
		}
		System.out.println("============================");
		
		
		// [5]
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) + ... 했을때
		// 몇까지 더해야 총 합이 100 이상이 되는지 구하시오.
		
		int sum2 =0;
		int cnt =0;
		// int i =1;
		// while(true){ 		>> 수가 정해진게 아니라면 while을 쓴다.
		for (int i = 1; i < 1000; i++) {
			if (i%2==0) {
				sum2 = sum2 + i*(-1);
			} else {
				sum2 = sum2 + i;
			}
			cnt = i;
			if (sum2>=100) {
				break;
			}
		}
		System.out.println(cnt);
		
		
		
	}
}
