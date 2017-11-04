package Class4_Pegasus;


public class Horse extends Animal2 {

	public Horse(String name) {
		super(name);
	}
	
	public void gallop() {
		System.out.println("I am galloping!");
	}

	@Override
	public void eat() {
		System.out.println("Mumph, mumph. A horse is eating.");
	}
}
