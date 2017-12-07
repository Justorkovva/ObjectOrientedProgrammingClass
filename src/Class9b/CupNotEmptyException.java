package Class9b;

public class CupNotEmptyException extends Exception {

	@Override
	public String getMessage() {
		return "WARNING: the cup is not empty!";
	}

}
