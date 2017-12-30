package Class10;

public class Order implements OrderInterface {
	private int orderNumber;
	private CustomerInterface customer;
	private double value;
	
	public Order(int orderNumber, CustomerInterface customer, double value) {
		this.orderNumber = orderNumber;
		this.customer = customer;
		this.value = value;
	}

	@Override
	public int getOrderNumber() {
		return orderNumber;
	}
	
	@Override
	public CustomerInterface getCustomer() {
		return customer;
	}

	@Override
	public double getValue() {
		return value;
	}
}
