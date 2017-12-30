package Class11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1_CatDemo {
	public static void main(String[] args) {
		List<Ex1_Cat> myCats = new ArrayList<>();
		Ex1_Cat kitty = new Ex1_Cat("Kitty");
		Ex1_Cat tiger = new Ex1_Cat("Tiger");
		Ex1_Cat tom = new Ex1_Cat("Tom");
		myCats.add(kitty);
		myCats.add(tiger);
		myCats.add(tom);
		Collections.sort(myCats);
		System.out.println(myCats);
	}
}
