package Class04;

public class Ex1_AnimalDemo {
	
	public static void main( String [ ] args ) {
		
		Ex1_Cat cat = new Ex1_Cat() ;
		Ex1_Mouse mouse = new Ex1_Mouse() ;
		cat.makeNoise () ;
		mouse.makeNoise () ;
		Ex1_Animal [] myPets = new Ex1_Animal [ 2 ] ;
		myPets [0] = cat ;
		myPets [1] = mouse ;
		for (Ex1_Animal pet : myPets) {
			pet.makeNoise();
		}
	}
}
