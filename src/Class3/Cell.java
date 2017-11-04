package Class3;

public class Cell {
	private boolean alive;
	
	public void setAlive(boolean l) {
		this.alive=l;
	}
	
	public boolean getAlive() {
		return this.alive;
	}
	
	@Override
	public String toString() {
		if(alive)
			return "A";
		else
			return "D";
	}

}
