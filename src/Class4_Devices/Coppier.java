package Class4_Devices;

public class Coppier extends PowerDevice implements CanScan,CanPrint {
	
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
		System.out.println("I'm a coppier. I'm scanning something");
	}
	
	@Override
	public void print() {
		System.out.println("I'm a copier. I'm printing something");
	}

}
