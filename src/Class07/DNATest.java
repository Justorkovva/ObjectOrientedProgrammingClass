package Class07;

public class DNATest {

		public static void main(String[] args) {
			DNA comp = new DNA();
			
			System.out.println("example 1:");
			String dna1 = "ACTG";
			String dna1Comp = comp.makeComplement(dna1);
			String dna1CompReverse = comp.makeComplementAndReverse(dna1);
			System.out.println(dna1);
			System.out.println(dna1Comp);
			System.out.println(dna1CompReverse);
			
			System.out.println("example 1:");
			String dna2 = "ACTGCCCGGGTTTAAA";
			String dna2Comp = comp.makeComplement(dna2);
			String dna2CompReverse = comp.makeComplementAndReverse(dna2);
			System.out.println(dna2);
			System.out.println(dna2Comp);
			System.out.println(dna2CompReverse);
					
		}

	}