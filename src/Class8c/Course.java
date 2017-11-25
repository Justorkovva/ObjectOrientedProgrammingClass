package Class8c;

//import animalsWithSingletonLazy.FoodManager;

public class Course {
	private String name;
	private String room;
	
	private static Course instance;

	private Course() { }
	
	public static Course getInstance() {
		if (instance == null) {
			instance = new Course();
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
}
