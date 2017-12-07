package Class9a;

public class Exam {
	public static void main(String[] args) {
		Student s1 = new Student();
		try {
			s1.setMark(8.0);
		} catch (IllegalMarkException e) {
			//System.out.println(e.getMessage()); - prints automatically
			e.printStackTrace();
		}
	}
}
