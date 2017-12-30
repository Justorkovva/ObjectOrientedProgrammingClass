package Class04;

public class Ex2_Printer extends Ex2_PowerDevice implements Ex2_CanPrint {
	
	Ex2_Printer(String s,double v, boolean b){
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
