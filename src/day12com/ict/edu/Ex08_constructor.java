package day12com.ict.edu;

public class Ex08_constructor {
	private String name = "물";
	private int price = 500;
	// 멤버 필드를 가지고 생성자 > using field
	
	public Ex08_constructor(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	// getter/setter 생성
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
