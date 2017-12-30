package Class10;

import java.util.ArrayList;
import java.util.List;

public class ShopDemo {

	public static void main(String[] args) {
		List<OrderInterface> allOrders = new ArrayList<>();
		for (int i=0; i<10; i++) {
			CustomerInterface myCustomer = new Customer(i+10);
			OrderInterface myOrder = new Order(i+1, myCustomer, 50 + 100 * i);
			allOrders.add(myOrder);
		}
		
		Shop myShop = new Shop(allOrders);
		myShop.printAllOrders();
	}
}
