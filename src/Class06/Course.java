package Class06;

import java.util.HashMap;
import java.util.Random;


public class Course {
	
	static Random rand = new Random();
	
	private static Double randomMark() {
		return 2.0 + 3.0 * rand.nextDouble();
	}
	
	public static void main(String[] args) {
		
		HashMap<Student,Double>	myCourse = new HashMap<>();
		
		Student einstein = new Student("Albert","Einstein",123);
		Student newton = new Student("Isaac", "Newton", 124);
		Student faraday = new Student("Michael", "Faraday", 125);
		Student sklododowska = new Student("Maria", "Sklodowska", 126);
		Student batman = new Student("Bruce", "Wayne", 101);
		Student spiderman = new Student("Peter", "Parker", 102);
		Student superman = new Student("Clark", "Kent", 103);
		Student bond = new Student("James","Bond",7);
		Student luke = new Student("Luke", "Skywalker", 1);
		Student vader = new Student("Darth", "Vader", 2);
		
		// add students into map with random mark
		myCourse.put(einstein, randomMark());
		myCourse.put(newton, randomMark());
		myCourse.put(faraday, randomMark());
		myCourse.put(sklododowska, randomMark());
		myCourse.put(batman, randomMark());
		myCourse.put(spiderman, randomMark());
		myCourse.put(superman, randomMark());
		myCourse.put(bond, randomMark());
		myCourse.put(luke, randomMark());
		myCourse.put(vader, randomMark());
		System.out.println("All students will be added with random marks");

		
		for (Student myStudent : myCourse.keySet()) {
			System.out.println(myStudent + " -- mark: " + myCourse.get(myStudent));
		}
		
		// search for best student
		Double bestMark = 2.0;
		Double mark;
		Student bestStudent = null;
		for (Student myStudent : myCourse.keySet()) {
			mark = myCourse.get(myStudent);
			if (mark > bestMark) {
				bestMark = mark;
				bestStudent = myStudent;
			}
		}
		System.out.println("The best student is:");
		System.out.println(bestStudent + " with mark " + bestMark);

		// all students should pass the course
		System.out.println();
		System.out.println("Increase the marks for students with mark smaller 3.0!");
		for (Student myStudent : myCourse.keySet()) {
			mark = myCourse.get(myStudent);
			if (mark < 3.0) {
				mark = 3.0;
				myCourse.put(myStudent,mark);
			}
		}
		
		for (HashMap.Entry<Student,Double> entry : myCourse.entrySet()) {
			System.out.println(entry.getKey() + " -- mark: " + entry.getValue());
		}
		
		
	}
}
