package Class08_Singleton;

public class Ex3_Professor {
	public static void main(String[] args) {
		Ex3_Course myCourse = Ex3_Course.getInstance();
		myCourse.setName("OJP3");
		myCourse.setRoom("403A");
		Ex3_Student[] myStudents = new Ex3_Student[4];
		for (int i = 0; i < myStudents.length; i++) {
			myStudents[i] = new Ex3_Student();
		}
		System.out.println("All students are working very hard ...");
		for (Ex3_Student a: myStudents) {
			a.study();
		}
	}
}
