package Class4_Devices;

public class Scanner extends PowerDevice implements CanScan {
	
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
