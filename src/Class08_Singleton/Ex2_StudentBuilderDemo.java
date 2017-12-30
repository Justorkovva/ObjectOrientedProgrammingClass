package Class08_Singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex2_StudentBuilderDemo {

	public static void main(String[] args) {
		Ex2_StudentBuilder sb = new Ex2_StudentBuilder();
		sb.setName("Albert Einstein");
		sb.setIdNumber(123);
		sb.setBirthday(LocalDate.of(1879, 3, 14));
		Ex1_Student einstein = sb.build();
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
