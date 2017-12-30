package Class09;

public class Ex1_Exam {
	public static void main(String[] args) {
		Ex1_Student s1 = new Ex1_Student();
		try {
			s1.setMark(9.0);
		} catch (Ex1_IllegalMarkException e) {
			//System.out.println(e.getMessage());// - prints automatically
			e.printStackTrace();
		}
	}
}
