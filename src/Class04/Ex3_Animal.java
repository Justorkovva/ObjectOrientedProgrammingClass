package Class04;

public abstract class Ex3_Animal {
	private String name;
	
	Ex3_Animal() {
		this.name="no-name";
	}
	
	public Ex3_Animal(String name) {
		this.name = name;
	}
	
	abstract public void eat();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//public abstract void makeNoise();
	
}