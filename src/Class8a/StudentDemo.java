package Class8a;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentDemo {

	public static void main(String[] args) {
		String einsteinName = "Albert Einstein";
		int	einsteinId = 123;
		LocalDate einsteinDate = LocalDate.of(1879, 3, 14);
		Student einstein = new Student(einsteinName,einsteinId,einsteinDate);
		System.out.println("We have the following students:");
		System.out.println(einstein);
		System.out.println();
		System.out.println("student data:");
		System.out.println("name:           " + einstein.getName());
		System.out.println("id number:      " + einstein.getIdNumber());
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("d MMM yyyy");
		System.out.println("date of birth:  " + einstein.getBirthday().format(myFormat));
	}
}
