package Class04;


public class Ex3_Horse extends Ex3_Animal {

	public Ex3_Horse(String name) {
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
