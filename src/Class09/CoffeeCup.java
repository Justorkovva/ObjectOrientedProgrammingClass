package Class09;

public class CoffeeCup {
	private int capacity;
	private int volume;
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "CoffeeCup [capacity=" + capacity + ", volume=" + volume + "]";
	}
	public CoffeeCup(int capacity) {
		this.capacity = capacity;
		this.volume = 0;
	}

}
