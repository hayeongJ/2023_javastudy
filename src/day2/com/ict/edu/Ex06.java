package day2.com.ict.edu;
class Ex06 {
	public static void main(String[] args){
		// String : ���ڿ��� ó���ϱ� ���ؼ� ���� Ŭ����
		// 		�⺻ �ڷ��� X, ���� �ڷ��� O(Ŭ������ �ڷ������� �����)
		//		�׷����� �⺻ �ڷ���ó�� ��� �����ϴ�.
		//		String ���� �̸� = "������" ;  
		// 'a' �� "a"�� ������ : 'a'�� char, "a" �� ���� �״�� a
		// �ݵ�� "" ���
		
		String name ="ȫ�浿";
		int age =17;
		// + ������ �� �� ������ ����� ������ String�̴�.
		// ���� ���� ������ ���� �ʰ� ���ڿ� �����ϴ� ������ ������ �Ѵ�.
		System.out.println(name);

		name ="1000";
		age = 1000;
		System.out.println(name + 50);
		System.out.println(age + 50);

		int su1 =20;
		int su2 =4;
		System.out.println(su1 + su2);
		System.out.println("��� : " + su1 + su2);

		// �ذ�å 1)
		int su3 = su1 + su2;
		System.out.println("��� : " + su3);	

		// �ذ�å 2)
		System.out.println("��� : " + (su1+su2)) ;	
	}
}









