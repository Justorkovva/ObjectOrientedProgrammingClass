package Class5;

import java.util.Set;
import java.util.TreeSet;

public class MySetExample {
	
	 public static void main( String [] args) {
	
	 Set<Integer> mySetA = new TreeSet<>();
	 mySetA.add(2);
	 mySetA.add(2); 
	 mySetA.add(5); 
	 mySetA.add(1); 
	 mySetA.add(7); 
	 mySetA.add(7); 
	 mySetA.add(7); 
	 // loop through the set : 
	 for ( Integer i : mySetA) { 
		 System. out . print ( i + " ") ; 
		} 
	 System.out.println() ; 
	 // you can simply print the set , because 14 // it overrides the toString () method: 15 System. out . println (mySetA) ;
	 }
}
