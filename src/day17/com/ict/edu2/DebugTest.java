package day17.com.ict.edu2;

public class DebugTest {
	
	public void call() {
		System.out.println("Call!");
	}

	public static void main(String[] args) {

		int arr[] = new int[5]; // int 타입의 배열 arr 크기 5로 선언
		DebugTest dt = new DebugTest(); // 객체화
		dt.call(); // call 메소드 호출
		
		for(int i = 0; i<=4; i++) { // 0, 1, 2, 3, 4까지 진행 후 5에서 에러 발생
			System.out.println(arr[i] = i);
		}
		
		System.out.println("END");

	}

}
