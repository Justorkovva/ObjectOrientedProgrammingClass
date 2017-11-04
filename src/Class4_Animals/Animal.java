package Class4_Animals;

public abstract class Animal {
	private String name;
	
	Animal() {
		this.name="no-name";
	}
	
	public Animal(String name) {
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
