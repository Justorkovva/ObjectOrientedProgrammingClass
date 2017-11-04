package Class2;

public class Bank {

	public static void main(String[] args) {
		Account a1=new Account();
		Account a2= new Account(1234);
		Account a3 = new Account(5678, 900);
		
		System.out.println("At the beggining");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		a1.setBalance(250);
		a2.credit(5000);
		a3.dedit(100);
		
		System.out.println("After a month");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}
}
