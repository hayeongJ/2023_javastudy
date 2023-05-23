package day11.com.ict.edu;

public class Ex06_method {

	// 변수가 없으니 받아야함, 저장 X

	// 총점을 구하는 총점 리턴하는 메소드
	public int getSum (int kor, int eng, int math) {
		int sum = kor+eng+math;
		return sum;
	} 
	
	
	// 평균을 구하는 메소드
	public double getAvg(int sum) {
		double avg =(int)(sum/3.0*10)/10.0;
		return avg;
	}
	
	
	// 학점을 구하는 메소드
	public String getHak(double avg) {
		String hak="";
		if (avg>=90) {
			hak="A";
		} else if (avg>=80) {
			hak="B";
		} else if (avg>=70) {
			hak="C";
		} else {
			hak="D";
		}
		return hak;
}
	
}
