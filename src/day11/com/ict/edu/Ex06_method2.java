package day11.com.ict.edu;

public class Ex06_method2 {
	
    String name = "";
    int count = 0 ;
    int kor = 0;
    int eng = 0;
    int math = 0;
    int sum = 0;
    double avg = 0.0;
    String hak = "";
    int rank = 0;

    public void getSum(int kor, int eng, int math) {
        sum = kor + eng + math;
    }

    public void getAvg() {
        avg = (int) (sum / 3.0 * 10) / 10.0;
    }

    public void getHak() {
        if (avg >= 90) {
            hak = "A";
        } else if (avg >= 80) {
            hak = "B";
        } else if (avg >= 70) {
            hak = "C";
        } else {
            hak = "F";
        }
    }

}