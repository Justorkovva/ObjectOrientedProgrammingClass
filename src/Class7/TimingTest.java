package Class7;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimingTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate christmas = LocalDate.of(2017,12, 24);
		Period  daysToChristmas = Period.between(today, christmas);
		System.out.println("Christmas is in : " + daysToChristmas.getMonths() 
		+ " months and " + daysToChristmas.getDays() + " days.");

		long totalNumberOfDays = ChronoUnit.DAYS.between(today, christmas);
		System.out.println("Total days to Christmas: " + totalNumberOfDays + " days." );
	}
}