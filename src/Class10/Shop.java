package Class10;

import java.util.List;

public class Shop {
	private List<OrderInterface> orderList;
	
	public Shop(List<OrderInterface> orderList) {
		this.orderList = orderList;
	}

	public void printAllOrders() {
		for (OrderInterface myOrder : orderList) {
			System.out.println("Order number:  " + myOrder.getOrderNumber());
			System.out.println("Order value:   " + myOrder.getValue());
			System.out.println("Customer id:   " + myOrder.getCustomer().getCustomerNumber());
		}
	}

	
}
