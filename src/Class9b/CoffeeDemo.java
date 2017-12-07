package Class9b;

public class CoffeeDemo {

	public static void main(String[] args) {
		CoffeePot pot = new CoffeePot(800);
		CoffeeCup cup = new CoffeeCup(200);
		
		System.out.println("Situation in the beginning:");
		System.out.println(pot);
		System.out.println(cup);
		int amount = 150;
		System.out.println("I will try to put "
				+ amount + " ml into the cup.");
		try {
			pot.fillCup(cup, amount);
		} catch (CupWillRunOverException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CupNotEmptyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Situation after the first coffee transfer:");
		System.out.println(pot);
		System.out.println(cup);
		amount = 150;
		System.out.println("I will try to put "
				+ amount + " ml into the cup.");
		
		try {
			pot.fillCup(cup, amount);
		} catch (CupWillRunOverException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CupNotEmptyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Situation after the second coffee transfer:");
		System.out.println(pot);
		System.out.println(cup);
		
		System.out.println("I will drink some coffee and make the cup empty!");
		cup.setVolume(0);
		
		amount = 400;
		try {
			pot.fillCup(cup, amount);
		} catch (CupWillRunOverException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CupNotEmptyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("OK, take care!");

	}

}
