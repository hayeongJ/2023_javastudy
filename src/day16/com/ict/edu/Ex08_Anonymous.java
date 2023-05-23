package day16.com.ict.edu;

// 추상클래스 : 추상 메소드를 하나 이상 가지고 있는 클래스

abstract class Abc{
	int data = 1000;
	public abstract void printData();
}

// 상속받는 방법 (가장 노멀)
class AbcTest extends Abc{

	@Override
	public void printData() {
		System.out.println("data1 : " + data);
	}
}

class AbcTest2 {
	// 상속 받지 않고 바로 객체 생성
	Abc abc = new Abc() {
		@Override
		public void printData() {
			System.out.println("data2 : " + data);
			
		}
	};
}
// 메소드나 메소드 인자에 사용된다.
class AbcTest3{
	public void prn() {
		new Abc() {
			@Override
			public void printData() {
				System.out.println("data3 : " + data);
				
			}
		}.printData();
	}
}
public class Ex08_Anonymous {
	public static void main(String[] args) {
		
		
		
		AbcTest2 t2 = new AbcTest2();
		System.out.println(t2.abc);
		t2.abc.printData();
		
		AbcTest3 t3 = new AbcTest3();
		t3.prn();
		
		
		
		
		
	}
}
