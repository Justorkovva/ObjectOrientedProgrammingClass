package Class11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3_ShipDemo {
	public static void main(String[] args) {
		List<Ex3_Ship> myShips = new ArrayList<>();
		Ex3_Ship santaMaria = new Ex3_Ship(19);
		Ex3_Ship titanic    = new Ex3_Ship(269);
		Ex3_Ship enterprise = new Ex3_Ship(342);
		Ex3_Ship smallBoat  = new Ex3_Ship(2);
		myShips.add(santaMaria);
		myShips.add(titanic);
		myShips.add(enterprise);
		myShips.add(smallBoat);
		Collections.sort(myShips);
		System.out.println(myShips);
	
		Ex3_Ship pinta = new Ex3_Ship(19);
		System.out.println("Checking methods equals() and compareTo() and hashcode()");
		System.out.println("pinta.equals(santaMaria) returns:    " + pinta.equals(santaMaria));
		System.out.println("pinta.compareTo(santaMaria) returns: " + pinta.compareTo(santaMaria));
		System.out.println("pinta.hashCode():      "  + pinta.hashCode());
		System.out.println("santaMaria.hashCode(): "  + santaMaria.hashCode());
		
		System.out.println("titanic.compareTo(smallBoat): "  + titanic.compareTo(smallBoat));
		System.out.println("smallBoat.compareTo(titanic): "  + smallBoat.compareTo(titanic));

	}
}
