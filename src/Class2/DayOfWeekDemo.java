package Class2;

public class DayOfWeekDemo {

	public static void main(String[] args) {
		DayOfWeek dow = new DayOfWeek();
		
		System.out.println("Let's start " + dow.toString());
		
		dow.nextDay();
		dow.nextDay();
		System.out.println("Two days passed, now it's " + dow.toString());
		dow.previousDay();
		System.out.println("Yesterday it was " + dow.toString());
		
	}

}
