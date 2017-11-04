package Class4_Devices;

public class DeviceDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner();
		Printer p = new Printer("Jack", 200.0, true );
		Coppier c = new Coppier();
		
		System.out.println("We have : ");
		System.out.println(s.toString());
		System.out.println(p.toString());
		System.out.println(c.toString());
		
		c.setName("Xavier");
		c.setVoltage(300);
		c.setState(true);
		
		p.switchOff();
		
		p.print();  
		
		System.out.println("Now we have");
		
		System.out.println(s.toString());
		System.out.println(p.toString());
		System.out.println(c.toString());
		
		
		
		

	}

}
