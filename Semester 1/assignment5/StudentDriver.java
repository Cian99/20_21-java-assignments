package assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentDriver {

	public static void main(String[] args) {
		
		// declaring, creating and assigning ArrayList collection
		List<Student> students = new ArrayList<>();
		
		// add student objects to the list
		students.add(new Student("Alex", 123, "IT"));
		students.add(new Student("Tommy", 124, "IT"));
		students.add(new Student("Kevin", 125, "Science"));
		
		// ListIterator
		ListIterator<Student> itr = students.listIterator();
		
		// iterate forwards and backwards
		System.out.println("Iterating the list forwards: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nIterating the list backwards: ");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
