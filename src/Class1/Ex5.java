package Class1;

public class Ex5 {
	
public static int forSum(int number) {
		int sum=0;;
		for(int i=1;i<=number;i++)
		{sum+=i;}
		return sum;
	}

	public static int littleGauss(int number) {		
		return ((number * (number+1))/2);
	}
	
	public static int recursiveSum(int number) {
		if(number==0) return 0;
		else return(number+recursiveSum(number-1));
	}

	public static void main(String[] args) {
		int number=20;
	//first way	
		System.out.println(forSum(number));
	//second
		System.out.println(littleGauss(number));
	//third
		System.out.println(recursiveSum(number));		
	}
}
