package Class08_Singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex1_Student {
	private final String name;
	private final int idNumber;
	private final LocalDate birthday;
	
	public Ex1_Student(String name, int idNumber, LocalDate birthday) {
		this.name = name;
		this.idNumber = idNumber;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public LocalDate getBirthday() {
		return birthday;
	}

	@Override
	public String toString() {
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("d MMM yyyy");
		return "Student [name=" + name + ", idNumber=" + idNumber + ", birthday=" + birthday.format(myFormat) + "]";
	}
}
