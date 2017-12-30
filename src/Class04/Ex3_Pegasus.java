package Class04;

public class Ex3_Pegasus extends Ex3_Horse implements Ex3_BirdInterface {

	public Ex3_Pegasus(String name) {
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
