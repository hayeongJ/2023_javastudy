package day11.com.ict.edu;

public class Ex04_method {
	
	int su1 = 10;
	int su2 = 20;
	int result = 0;
	
	// 메소드이름([인자], ...)
	// 인자 : 메소드가 실행할 때 외부에서 필요한 정보를 받기 위한 통로이다.
	// 인자의 수나 자료형에 따라서 같은 이름의 메소드를 여러개 만들 수 있다. (오버로딩, 오버로드)
	
	// 더하기
	
	public void add() {
		result = su1 + su2;
		
	}
	
	public void add(int k1) {
		result = k1 + su2;
		
	}
	
	public void add(int k1, int k2) {
		result = k1 + k2; // 내부에 있는걸 사용하지 않고 외부의 것으로 결과를 냄
		
	}	
	
	public int sub() {
		result = su1 - su2;
		return result;
	}
	
	public int sub(int k1) {
		result = k1 - su2;
		return result;
	}
	
	public int sub(int k1, int k2) {
		result = k1 - k2;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
