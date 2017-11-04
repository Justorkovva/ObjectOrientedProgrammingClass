package Class2;

public class SquareDemo {

	public static void main(String[] args) {
		
		int len=12;
		double len2=10;
		Square square= new Square(len);
		
		System.out.println("Square length  " + square.getLength());
		
		square.setLength(len2);
		
		System.out.println("New square length  " + square.getLength());
		
		System.out.println("Area : " + square.calcArea());
		
		System.out.println("Perimeter : "+ square.calcPerimeter());
		
		System.out.println(square.toString());
	}

}
