package Class01;

public class Ex4_Fahrenheit {


public static void main(String[] args) {
		
	double fahrenheit ;
	double celsius;
	
	for(fahrenheit=0;fahrenheit<=300;fahrenheit+=20){
	celsius = 5 * (fahrenheit-32)/ 9;
	 System.out.println ("Temperture : " + fahrenheit + " Fahrenheit = "
	+ celsius + " Celsius ") ;
	}
}
}
