package Class4_Pegasus;



public class Bird extends Animal2 {

	public Bird(String name) {
		super(name);
	}
	
	public void fly() {
		System.out.println("I am flying. I am flying.");
	}

	@Override
	public void eat() {
		System.out.println("Pick pick - a bird is eating.");
	}
}

