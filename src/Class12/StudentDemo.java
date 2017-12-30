package Class12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class StudentDemo  {
		
		static Random rand = new Random();
		
		public static void main(String[] args) {
			
			List <Student> students= new ArrayList<>(5); 
			Student spiderman = new Student("Peter", "Parker", 102);
			Student superman = new Student("Clark", "Kent", 103);
			Student bond = new Student("James","Bond",7);
			Student luke = new Student("Luke", "Skywalker", 1);
			Student vader = new Student("Darth", "Vader", 2);
			students.add(spiderman);
			students.add(superman);
			students.add(bond);
			students.add(luke);
			students.add(vader);
			
			Comparator<Student> byName = new Comparator<Student>() { 
				 @Override 
				 public int compare(Student o1, Student o2) {  
				 return o1.getSurname() .compareTo(o2.getSurname()); 
				 }
			};
			
			 System.out.println (" Sorting by name: ") ; 
			 Collections.sort (students, byName); 
			 for (Student s : students) { 
				 System.out.println (s) ; 
			}
			
			 
			 Comparator<Student> byIndexUp = new Comparator<Student>() { 
				 @Override 
				 public int compare(Student o1, Student o2) {  
					 return o1.getIndexNumber() - o2. getIndexNumber() ;
				 }
			};
			
			 System.out.println (" Sorting by index increasing: ") ; 
			 Collections.sort (students, byIndexUp); 
			 for (Student s : students) { 
				 System.out.println (s) ; 
			}
			 
			 System.out.println (" Sorting by index decreasing: ") ; 
			 Collections.sort (students, byIndexUp.reversed()); 
			 for (Student s : students) { 
				 System.out.println (s) ; 
			}
			 
			 System.out.println("Exercise 2 now:");
			 
			 Comparator<Student> ex2 = new Comparator<Student>() { 
				 @Override 
				 public int compare(Student o1, Student o2) {  
					 if(o1.getSurname().equals(o2.getSurname())) {
						 if(o1.getFirstname().equals(o2.getFirstname())) { 
							 return o1.getIndexNumber() - o2. getIndexNumber() ;
						 }
						 return o1.getFirstname().compareTo(o2.getFirstname()); 
					 }
				 return o1.getSurname().compareTo(o2.getSurname()); 
				 }
			};
			 
			System.out.println (" Sorting by Ex2: ") ; 
			 Collections.sort (students, ex2); 
			 for (Student s : students) { 
				 System.out.println (s) ; 
			}
			
		}
	}
