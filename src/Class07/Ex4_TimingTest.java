package Class07;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex4_TimingTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate christmas = LocalDate.of(2018,12, 24);
		Period  daysToChristmas = Period.between(today, christmas);
		System.out.println("Christmas is in : " + daysToChristmas.getMonths() 
		+ " months and " + daysToChristmas.getDays() + " days.");

		long totalNumberOfDays = ChronoUnit.DAYS.between(today, christmas);
		System.out.println("Total days to Christmas: " + totalNumberOfDays + " days." );
	}
}