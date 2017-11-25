package Class8a;

import java.time.LocalDate;

public class StudentBuilder {
	private String name;
	private int idNumber;
	private LocalDate birthday;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Student build() {
		return new Student(name, idNumber, birthday);
	}
	
}
