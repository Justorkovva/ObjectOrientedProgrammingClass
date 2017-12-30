package Class04;

public abstract class Ex1_Animal {
	private String name;
	
	Ex1_Animal() {
		this.name="no-name";
	}
	
	public Ex1_Animal(String name) {
		this.name = name;
	}
	
	//abstract public void eat();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void makeNoise();
	
}
