package Class12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PresentsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Mom = new Person("Mom");
		Person Dad = new Person("Dad");
		Person Cat = new Person("Cat");
		Present Flowers = new Present("Flowers", 50);
		Present Meat = new Present("Meat", 10);
		Present Pijamas = new Present("Pijamas", 50);
		
		List <Person> pers= new ArrayList<>(); 
		Map<Person,Present> family = new HashMap<>() ;
		 
		 
		 Comparator<Person> byName = new Comparator<Person>() { 
			 @Override 
			 public int compare(Person o1, Person o2) {  
			 return o1.getname() .compareTo(o2.getname()); 
			 }
		};
		
		
		 System.out.println (" Sorting by name: ") ; 
		 Collections.sort (pers, byName); 
		 for (Person s : pers) { 
			 System.out.println (s) ; 
		}
		  
		 family.put(Cat, Meat);
		 family.put(Dad, Pijamas);
		 family.put(Mom, Flowers);
		 
		 
		 
		 double TotalPrice=0;
		 int av=0;
		 System.out.println("Family:");
		 for (Map. Entry<Person,Present> entry : family.entrySet()) { 
			 Person my = entry .getKey() ; 
			 System.out.println (my.getname()); 
			 
			 Present myValue = entry.getValue();
			 TotalPrice+=myValue.getprice();
			 av++;
		 }
		 
		 
		 System.out.println("Presents cost  " + TotalPrice);
		 System.out.println("Average price is " + TotalPrice/av);
	}

}
