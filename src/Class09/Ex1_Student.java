package Class09;

public class Ex1_Student {
	double mark;

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) throws Ex1_IllegalMarkException {
		if (mark > 5.5 || mark < 0.0) {
			throw new Ex1_IllegalMarkException();
		}
		this.mark = mark;
	}
}
