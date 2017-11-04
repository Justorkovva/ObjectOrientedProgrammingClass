package Class1;

public class Ex6 {

	public static void main(String[] args) {

		int stars=1,j;
		
		for(int i=0;i<5;i++) {
			
		for (j=0;j<5-i;j++)
		{System.out.print(" ");}
		
		for(j=0;j<stars;j++) {
		System.out.print("*");}
		
		for (j=0;j<5-stars;j++)
		{System.out.print(" ");}
		
		System.out.println();
		stars+=2;					
		}
		System.out.println("     |");
		
	}
}