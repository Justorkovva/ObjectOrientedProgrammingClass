package Colloquium1;

public class CatDemo {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Meow", 2);
		
		System.out.println("First cat default name - " +cat1.getName());
		System.out.println("Second cat given name - " + cat2.getName());
		
		cat1.setName("Dog");
		
		System.out.println("Now first cat has a name - " + cat1.getName());
		
		System.out.println(cat2.getName() + " is now  " + cat2.getAge() + " years old");
		
		cat2.setAge(cat2.getAge() + 2);
		
		System.out.println("After 2 years it will be " + cat2.getAge() + " years old");

	}

}
