package day5.com.ict.edu;

public class Ex_homework {
	public static void main(String[] args) {
		// [1]
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) 
		// for 문을 이용한 누적합 출력하기
				
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			if (i%2==1) {
				sum = sum + i;
			} else {
				sum = sum + i*(-1);
			}
		}
		System.out.println("누적합 = " + sum);
		System.out.println("=============================");
				
		// [2]
		// if ~ else문
		// 농구공 5개씩 한 박스에 들어간다. 40개면 8상자, 26개면 6상자이다.
		// int k1 = 127 이다. 몇 상자가 필요할까?
				
		int k1 = 127;
		int box = 0;
		if (box%5==0) {			// box는 5의 배수가 참이라면
			box = k1/5;			
		} else {				// 5의 배수가 아니라면
			box = (k1/5)+1;		// 농구공(k1)/5 의 몫에 +1 한 값이 상자의 갯수
		}
		System.out.println("필요한 상자 갯수 : " + box);
		
		System.out.println("=============================");
		
				
		// [3]
		// for문으로 풀기
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
				
		for (int a = 1; a < 5; a++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("=============================");
				
				
		// [4]
		// 이중 for문으로 풀기 			!아직 안풀음!
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
				
		char g ='0';
		char h ='1';
		for (int b = 1; b < 5; b++) { 		// 세로 줄 : 총 4줄
			for (int c = 1; c < 5; c++) {
				if (b==c) {
					System.out.print(h+"");
				} else {
					System.out.print(g+"");
				}
			}System.out.println();
					
		}
		System.out.println("=============================");
				
				
				// [5]
				// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10) + ... 했을때
				// 몇까지 더해야 총 합이 100 이상이 되는지 구하시오.
				
				int n;
				int sumsum = 0;
				for (n = 1; true ; n++) {
					if (n%2==1) {
						sumsum = sumsum + n;
					} else {
						sumsum = sumsum + n*(-1);
					}
					if (sumsum >=100) break;
				}
				System.out.println("n = " + n);
				System.out.println("=============================");	
				
				
				
				
				// [6] 아래 출력하기 (for문)
				// *
				// **
				// ***
				// ****
				
				for (int x = 1; x < 5; x++) { 			// 줄
					for (int y = 1; y < x+1; y++) {		// 별
						System.out.print("*");
					}
					System.out.println(""); // 한 줄 출력 후 줄바꿈
				}
				System.out.println("=============================");
				
				
				
				// [7] 아래 출력하기 (for문) 
				//     *
				//    **
				//   ***
				//  ****
				
				for (int s = 1; s < 5; s++) { 	// 줄 1~4줄
					for (int t = 4; t> s ; t--) {	// 공백 s=1일때 공백 4
						System.out.print(" ");		// 공백 s=2일때 공백 3
					}
					for (int u = 1; u <s+1 ; u++) {	// 별
						System.out.print("*");		//s=1일때 별 1
					}
					System.out.println(); // 한 줄 출력 후 줄바꿈
				}
				
				System.out.println("=============================");
				
				
			
				// 7번 -2
				for (int s = 0; s < 5; s++) {		// 줄
					for (int t = 0; t <4-s ; t++) {	//공백
						System.out.print(" ");
					}
					for (int t = 1; t <s+1 ; t++) {	// 별
						System.out.print("*");
					}
					System.out.println();
				}
				
	}
}
