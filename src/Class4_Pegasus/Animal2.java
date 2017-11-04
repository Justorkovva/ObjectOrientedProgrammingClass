package Class4_Pegasus;

public abstract class Animal2 {
	private String name;
	
	Animal2() {
		this.name="no-name";
	}
	
	public Animal2(String name) {
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
