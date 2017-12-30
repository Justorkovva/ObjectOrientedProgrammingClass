package Class11;

public class Ex1_Cat implements Comparable<Ex1_Cat> {
	private String name;

	public Ex1_Cat(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Ex1_Cat other) {
		return name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Ex1_Cat other = (Ex1_Cat) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
