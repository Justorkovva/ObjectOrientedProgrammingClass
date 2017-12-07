package Class9a;

public class Student {
	double mark;

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) throws IllegalMarkException {
		if (mark > 5.5 || mark < 0.0) {
			throw new IllegalMarkException();
		}
		this.mark = mark;
	}
}
