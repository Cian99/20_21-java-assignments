package assignment4;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		
		Scanner int_input = new Scanner(System.in);
		Scanner string_input = new Scanner(System.in);
		
		Student[] students = create();
		
		populate(students);
		
		display(students);
		
		string_input.close();
		int_input.close();
		
	}
	
	public static Student[] create() {
		
		Scanner int_input = new Scanner(System.in);
		
		System.out.println("How many students would you like to enter data for? ");
		
		Student[] students = new Student[int_input.nextInt()];
		
		return students;
		
	}
	
	public static void populate(Student[] students) {
		
		Scanner int_input = new Scanner(System.in);
		Scanner string_input = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++) {
			students[i] = new Student();
			System.out.println("Please enter the name of the student: ");
			students[i].setName(string_input.nextLine());
			System.out.println("Please enter the ID number of the student: ");
			students[i].setidNumber(int_input.nextInt());
			System.out.println();
		}
		
	}
	
	public static void display(Student[] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].toString());
		}
		
	}

	
		
}
