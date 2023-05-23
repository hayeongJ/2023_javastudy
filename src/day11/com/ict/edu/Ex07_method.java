package day11.com.ict.edu;

public class Ex07_method {
	int sum =0;
	double avg =0.0;
	String hak ="";
	
	// void로 구하기 (총점, 평균, 학점)
	
	public void getSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	public void getAvg(int k1) {
		avg = (int)(k1/3.0*10)/10.0;
	}
	public void getHak() {	// (double k1)이라고 써도 됨
		if (avg>=90) {		// avg 대신 k1이 들어가게 된다.
			hak="A";
		}else if(avg>=80){
			hak="B";
		}else if(avg>=70) {
			hak="C";
		}else {
			hak="F";
		}
	}
}
