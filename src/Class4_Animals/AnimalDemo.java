package Class4_Animals;

public class AnimalDemo {
public static void main( String [ ] args ) {
Cat cat = new Cat() ;
Mouse mouse = new Mouse() ;
cat.makeNoise () ;
mouse.makeNoise () ;
Animal [] myPets = new Animal [ 2 ] ;
myPets [0] = cat ;
myPets [1] = mouse ;
for (Animal pet : myPets) {
	pet.makeNoise();
;
}
}
}
