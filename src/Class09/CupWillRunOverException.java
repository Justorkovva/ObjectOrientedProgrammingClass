package Class09;

public class CupWillRunOverException extends Exception {

	@Override
	public String getMessage() {
		return "WARNING: the cup will run over!";
	}

}
