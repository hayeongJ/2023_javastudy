package day2.com.ict.edu;
class Ex05{
	public static void main(String[] args){
		int kor =90;
		int eng = 80;
		int math = 80;

		// ���� ���ϱ�
		// int sum = 90 + 80 + 80; >> Ʋ�� ���� �ƴ�
		int sum = kor + eng + math;	
		
		// ��� ���ϱ�
		int avg = sum/3;
		// int�� int�� ����̱� ������ ����� int (�Ҽ����� ������ X)
		

		// �Ҽ��� ���� ���
		double avg2 =sum/3 ; // �Ҽ����� ����
		double avg3 = (double)(sum/3);		

		double avg4 = (double)(sum)/3;		
		double avg5 = sum/3.0;

		// avg5 ������ �Ҽ��� ���ڸ� ���� ���ϱ�
		double avg6 = (int)(avg5*100) / 100.0;

		System.out.println(sum);
		System.out.println(avg);
		System.out.println(avg2);
		System.out.println(avg3);		
		System.out.println(avg4);
		System.out.println(avg5);
		System.out.println(avg6);

		// 1472�� ������ �����ؼ� 1470���� �����
		int num1 = 1472;
		int num2 = (num1/10)*10;  // int �� int ���
		System.out.println(num2) ;
	}
}





