package day12com.ict.edu;

public class Ex09_Constructor {
	// Ex04 참고
	// 이름,국어,영어,수학 받는 생성자 (기본생성자 X)
	private String name ="";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg =0.0;
	private String hak ="";
	private int rank = 0;
	
	public Ex09_Constructor() {
		
	}


	public Ex09_Constructor(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		process();
	}
	// 순위와 정렬은 여러사람의 정보라서 process에서 못함
	// 아래 process는 한 사람의 정보!
	public void process() {
		sum=kor+eng+math;
		avg=(int)(sum/3.0*10)/10.0;
		if(avg>=90) {
			hak="A";
		}else if(avg>=80) {
			hak="B";
		}else if(avg>=70) {
			hak="C";
		}else {
			hak ="F";
		}
	}
	
	
	/*
	// 총점
	public void gSum() {
		sum = kor+eng+math;
	}
	// 평균 구하는 메소드
	public void gAvg(){
		avg = (int)(sum/3.0*10)/10.0;
	}	
	// 학점 구하는 메소드
	public void gHak() {
		if(avg>=90) {
			hak="A";
		}else if(avg>=80) {
			hak="B";
		}else if(avg>=70) {
			hak="C";
		}else {
			hak ="F";
		}
	}
	// 출력하는 메소드
	public void prn() {
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+hak);
	}
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
}
