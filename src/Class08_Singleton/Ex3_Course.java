package Class08_Singleton;

public class Ex3_Course {
	private String name;
	private String room;
	
	private static Ex3_Course instance;

	private Ex3_Course() {}
	
	public static Ex3_Course getInstance() {
		if (instance == null) {
			instance = new Ex3_Course();
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
