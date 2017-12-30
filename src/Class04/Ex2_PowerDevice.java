package Class04;

public abstract class Ex2_PowerDevice {
	String name;
	double voltage;
	boolean state;
	
	Ex2_PowerDevice() {
		this.name = "n";
		this.voltage=0;
		this.state=false;
	}
	
	Ex2_PowerDevice(String n, double v, boolean s) {
		this.name = n;
		this.voltage=v;
		this.state=s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getVoltage() {
		return this.voltage;
	}
	
	public boolean getState() {
		return this.state;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public void setVoltage(double v) {
		this.voltage=v;
	}
	
	public void setState(boolean s) {
		this.state=s;
	}
	
	@Override
	public String toString() {
		String a;
		if(this.state)
			a="ON";
		else
			a="OFF";
		
		return "Device  " + this.name + "  " + this.voltage + " V   is  " + a; 
	}
	
	public abstract void switchOn();
	public abstract void switchOff();

}