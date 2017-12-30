package Class08_Singleton;

public class Ex3_Student {
	public void study() {
		System.out.print("I go to room " + Ex3_Course.getInstance().getRoom() + ". ");
		System.out.println("I study " + Ex3_Course.getInstance().getName() + ". ");
	}
}
