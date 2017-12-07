package Class9a;

public class IllegalMarkException extends Exception {

	@Override
	public String getMessage() {
		return "ERROR: this mark is not possible!";
	}

}
