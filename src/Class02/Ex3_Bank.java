package Class02;

public class Ex3_Bank {

	public static void main(String[] args) {
		Ex3_Account a1=new Ex3_Account();
		Ex3_Account a2= new Ex3_Account(1234);
		Ex3_Account a3 = new Ex3_Account(5678, 900);
		
		System.out.println("At the beggining");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		a1.setBalance(250);
		a2.credit(5000);
		a3.debit(100);
		
		System.out.println("After a month");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}
}
