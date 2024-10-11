package assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner int_input = new Scanner(System.in);
		Scanner string_input = new Scanner(System.in);
		
		// ArrayList of Students
		List<Student> students = new ArrayList<>();
		
		// create students
		UnderGraduate student1 = new UnderGraduate();
		PostGraduate student2 = new PostGraduate();
		UnderGraduate student3 = new UnderGraduate();
		PostGraduate student4 = new PostGraduate();
		UnderGraduate student5 = new UnderGraduate();
		
		// add them to the arraylist
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		System.out.println("Each student takes "+ student1.getNumTests() + " tests");
		
		// read in student name, id and test results
		for(int i=0; i<students.size(); i++) {
			System.out.println("\nEnter Student name: ");
			students.get(i).setName(string_input.nextLine());
			System.out.println("Enter Student ID: ");
			students.get(i).setID(int_input.nextInt());
			System.out.println("Enter Student grades: ");
			for(int index=0; index<5; index++) {
				System.out.println("Enter test score (from 0-100) ");
				students.get(i).setTestScore(int_input.nextInt(), index);
			}
		}
		
		// print out the results, specifying whether each student passes or failed
		for(int i=0; i<students.size(); i++) {
			System.out.println("\n" + students.get(i).toString());
			students.get(i).calculateResult();
			System.out.println("Result: " + students.get(i).getGrade());
		}
		
		
		int_input.close();
		string_input.close();
	
	}

}
