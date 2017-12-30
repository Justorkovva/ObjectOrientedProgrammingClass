package Class02;

public class Ex2_DayOfWeekDemo {

	public static void main(String[] args) {
		Ex2_DayOfWeek dow = new Ex2_DayOfWeek(2);
		
		System.out.println("Let's start " + dow.toString());
		
		dow.nextDay();
		dow.nextDay();
		System.out.println("Two days passed, now it's " + dow.toString());
		dow.previousDay();
		System.out.println("Yesterday it was " + dow.toString());
		
	}

}
