package Class6;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int maxInt = 48; //I'm adding 1 later
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size()<6) {
			
			lotto.add(rand.nextInt(maxInt)+1);
		}	
		
		for(Integer i : lotto) {
			System.out.println(i);
		}
	}
}
