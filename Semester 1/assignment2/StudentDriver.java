package assignment2;

public class StudentDriver {

	public static void main(String[] args) {
		
		// 3 instances of the student class
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		// array
		Student[] students = {student1, student2, student3};
		
		// test the constructor
		System.out.println("----------------");
		System.out.println("Test Constructor");
		System.out.println("----------------");
		System.out.println(students[0].getName());
		System.out.println(students[0].getCourse());
		System.out.println(students[0].getIDnumber());
		
		// overwrite the values
		student1.setName("John Doe");
		student1.setCourse("2BA");
		student1.setIDnumber(12345678);
		
		student2.setName("Jane Doe");
		student2.setCourse("2BA");
		student2.setIDnumber(12567834);
		
		student3.setName("John Smith");
		student3.setCourse("2BA");
		student3.setIDnumber(12347856);
		
		// start displaying the students data
		System.out.println("Student Data");
		System.out.println("---------------");
		
		// for loop
		for(int i=0; i<students.length; i++) {
			System.out.println("Name: " + students[i].getName());
			System.out.println("Course: " + students[i].getCourse());
			System.out.println("ID Number: " + students[i].getIDnumber() + "\n");
		}
	}
	
}
