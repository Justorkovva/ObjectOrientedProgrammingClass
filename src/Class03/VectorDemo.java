package Class03;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		Vector v2 = new Vector(5,5,5);
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		v1.add(v2);
		System.out.println(v1.toString());
		v1.minus(v2);
		System.out.println(v1.toString());
		
		v2.multiply(4.2);
		System.out.println(v2.toString());
	}
}
