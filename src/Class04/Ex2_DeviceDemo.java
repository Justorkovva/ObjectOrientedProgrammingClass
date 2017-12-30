package Class04;

public class Ex2_DeviceDemo {

	public static void main(String[] args) {
		
		Ex2_Scanner s = new Ex2_Scanner();
		Ex2_Printer p = new Ex2_Printer("Jack", 200.0, true );
		Ex2_Coppier c = new Ex2_Coppier();
		
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
