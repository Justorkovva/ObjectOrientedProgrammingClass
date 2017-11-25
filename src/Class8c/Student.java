package Class8c;

public class Student {
	public void study() {
		System.out.print("I go to room " + Course.getInstance().getRoom() + ". ");
		System.out.println("I study " + Course.getInstance().getName() + ". ");
	}
}
