package Class1;

public class Ex4 {


public static void main(String[] args) {
		

	double fahrenheit ;
	double celsius;
	int lower = 0;
	
	for(lower=0;lower<=300;lower+=20){
		fahrenheit = lower ;
	celsius = 5 * (fahrenheit-32)/ 9;
	 System.out.println ("Temperture : " + fahrenheit + " Fahrenheit = "
	+ celsius + " Celsius ") ;
	}
}
}
