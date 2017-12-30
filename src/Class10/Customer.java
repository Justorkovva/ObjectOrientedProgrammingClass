package Class10;

public class Customer implements CustomerInterface {
	private int customerNumber;
	
	public Customer(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public int getCustomerNumber() {
		return customerNumber;
	}
}
