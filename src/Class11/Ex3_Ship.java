package Class11;

public class Ex3_Ship implements Comparable<Ex3_Ship> {
	private int  length;

	public Ex3_Ship(int length) {
		this.length = length;
	}

	@Override
	public int compareTo(Ex3_Ship other) {
		return this.length - other.length;
	}

	@Override
	public String toString() {
		return "Ship [length=" + length + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex3_Ship other = (Ex3_Ship) obj;
		if (length != other.length)
			return false;
		return true;
	}
}
