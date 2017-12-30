package Class06;

import java.util.Objects;

public class Student {
	private String firstname;
	private String surname;
	private int indexNumber;

	public Student(String firstname, String surname, int indexNumber) {
		this.firstname = firstname;
		this.surname = surname;
		this.indexNumber = indexNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.indexNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (indexNumber != other.indexNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return firstname + " " + surname + ", indexNumber: " + indexNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}
	
}
