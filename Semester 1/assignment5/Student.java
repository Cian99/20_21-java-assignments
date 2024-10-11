package assignment5;

public class Student {
	
	// data members
	private String name;
	private int id;
	private String course;
		
	// constructor
	public Student() {
		this("Unassigned", 0, "Unassigned");
	}
		
	// overloaded constructor
	public Student(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}
		
	// getters
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public String getCourse() {
		return course;
	}
		
	// setters - taking in name of type string 
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int id) {
		this.id = id;
	}
	public void setCourse(String course) {
		this.course = course;
	}
		
	@Override
	public String toString() {
		return "Student name: " + getName() + ", ID: " + getID() + " and course: " + getCourse();
	}

}
