package Class4_Pegasus;

public class Pegasus extends Horse implements BirdInterface {

	public Pegasus(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("Im flying hehe");
	}
	

	@Override
	public void eat() {
		System.out.println("Im eating cause I'm hungry");
	}
	
	

}
