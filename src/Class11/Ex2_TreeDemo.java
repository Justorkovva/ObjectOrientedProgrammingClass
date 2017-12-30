package Class11;

import java.util.Random;

public class Ex2_TreeDemo {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("Binary tree for Integers");
		int maxInt = 100;
		Ex2_Node<Integer> myIntegerTree = new Ex2_Node<>(rand.nextInt(maxInt));
		for (int i=0; i<10; ++i) {
			myIntegerTree.insert(rand.nextInt(maxInt));
		}
		
		myIntegerTree.showAllElements();
		
		System.out.println("Binary tree for Strings");
		Ex2_Node<String> myStringTree = new Ex2_Node<>("ABC");
		myStringTree.insert("BBB");
		myStringTree.insert("AAA");
		myStringTree.insert("CCC");
		myStringTree.insert("CCC"); // same element added two times
		myStringTree.insert("abc"); // what about small letters
		myStringTree.insert("aaa"); // what about small letters
		myStringTree.insert("bbb"); // what about small letters
		myStringTree.insert("123"); // what about numbers?
		
		myStringTree.showAllElements();
	}

}
