package Class5;

import java.util.Random;

public class TreeDemo {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int maxInt = 100;
		Node myTree = new Node(rand.nextInt(maxInt));
		for (int i=0; i<10; ++i) {
			myTree.insert(rand.nextInt(maxInt));
		}
		
		myTree.showAllElements();
	}

}
