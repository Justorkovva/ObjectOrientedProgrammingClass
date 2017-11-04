package Class4_Devices;

public class Printer extends PowerDevice implements CanPrint {
	
	Printer(String s,double v, boolean b){
		super(s,v,b);
	}
	
	@Override
	public void switchOn() {
		this.state=true;
	}
	
	@Override
	public void switchOff() {
		this.state=false;
	}
	
	@Override
	public void print() {
		System.out.println("I'm printing something");
	}

}
