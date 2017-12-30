package Class12;


public class Student {
	
	private String firstname;
	private String familyname;
	private int indexNumber;

	public Student(String firstname, String surname, int indexNumber) {
		this.firstname = firstname;
		this.familyname = surname;
		this.indexNumber = indexNumber;
	}


	@Override
	public String toString() {
		return firstname + " " + familyname + ", indexNumber: " + indexNumber;
	}

	public String getSurname() {
		return familyname;
	}

	public void setSurname(String surname) {
		this.familyname = surname;
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

/*
 * @Override
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
	*/
