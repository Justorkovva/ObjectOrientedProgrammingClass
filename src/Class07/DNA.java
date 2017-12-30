package Class07;

import java.util.HashMap;
import java.util.Map;

public class DNA {
	private Map<Character,Character>  complement;

	public DNA() {
		init();
	}
	
	private void init() {
		complement = new HashMap<>(4);
		complement.put('A', 'T');
		complement.put('T', 'A');;
		complement.put('C', 'G');
		complement.put('G', 'C');
	}
	
	public String makeComplement(String input) {
		StringBuilder sb = new StringBuilder(input.length());
		char base;
		char inverseBase;
		for (int i=0; i<input.length(); i++) {
			base = input.charAt(i);
			inverseBase = complement.get(base);
			sb.append(inverseBase);
		}
		return sb.toString();
	}
	
	public String makeComplementAndReverse(String input) {
		StringBuilder sb = new StringBuilder(makeComplement(input));
		return sb.reverse().toString();
	}
	
	
}
