package Class8c;

public class Professor {
	public static void main(String[] args) {
		Course myCourse = Course.getInstance();
		myCourse.setName("OJP3");
		myCourse.setRoom("403A");
		Student[] myStudents = new Student[4];
		for (int i = 0; i < myStudents.length; i++) {
			myStudents[i] = new Student();
		}
		System.out.println("All students are working very hard ...");
		for (Student a: myStudents) {
			a.study();
		}
	}
}
