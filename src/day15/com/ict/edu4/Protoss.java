package day15.com.ict.edu4;

public class Protoss implements Unit {
	private String name;
	private int energy;
	private boolean fly;
	
	public Protoss(String name, int energy, boolean fly) {
		super();
		this.name=name;
		this.energy=energy;
		this.fly=fly;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public Protoss() {
		
	}
	@Override
	public void decEnergy() {
		energy = energy -10;
	}
	
}
