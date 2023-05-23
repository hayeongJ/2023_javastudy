package day12com.ict.edu;

public class Ex02_get_set {
	private String name ="홍길동";
	private int age = 24;
	private double weight = 72.6;
	private boolean gender= true; // 필요에 의해서 추가
	
	public boolean isGender() { // boolean 형만 is형이 있다. (getter)
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	// 지역변수와 전역변수의 이름이 같으면 전역변수에 this를 붙인다.
	// 지역변수가 전역변수보다 우선순위가 더 높다.
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}
