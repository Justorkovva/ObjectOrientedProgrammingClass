package Class09;

public class Ex1_IllegalMarkException extends Exception {

	@Override
	public String getMessage() {
		return "ERROR: this mark is not possible!";
	}

}
