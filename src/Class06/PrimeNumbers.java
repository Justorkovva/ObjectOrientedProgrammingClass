package Class06;

import java.util.TreeSet;

public class PrimeNumbers {

		public static void main(String[] args) {
			
			Integer n = 1000;

			TreeSet<Integer> setM = new TreeSet<>();
			TreeSet<Integer> setS = new TreeSet<>();
			for (int i=2; i<=n; ++i) {
				setM.add(i);
			}
			
			Integer p=2;
			
			while (p <= n) {
				Integer xp = 2 * p;
				while (xp <= n) {
					setS.add(xp);
					xp += p;
				}
				setM.removeAll(setS);
				setS.clear();
				p = setM.higher(p);
				if (p==null) { break; }
			}
			int counter = 0;
			for (Integer m : setM) {
				counter++;
				System.out.print(m + " ");
				if (counter >= 10) {
					counter = 0;
					System.out.println();
				}
			}
		}

}
