package Class04;

public class Ex2_Scanner extends Ex2_PowerDevice implements Ex2_CanScan {
	
	@Override
	public void switchOn() {
		this.state=true;
	}
	
	@Override
	public void switchOff() {
		this.state=false;
	}
	
	@Override
	public void scan() {
		System.out.println("I'm scanning something");
	}

}
