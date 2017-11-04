package Colloquium1;

public class Cat {
	private String name;
	private int age;

	//constructors
	Cat() {
		name="no-name";
		age=0;}
	Cat(String nam, int ag) {
		this.name=nam;
		this.age=ag;
	}
	
	//setters, getters
	
	public void setName(String nam) {
		this.name=nam;
	}
	public void setAge(int ag) {
		this.age=ag;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
}
