package assignment2;

public class Student {
	
	private String name;
	private String course;
	private int Idnumber;
	
	// constructor
	public Student() {
		name = "Unassigned";
		course = "Unassigned";
		Idnumber = 0;
	}
		
	// getters
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public int getIDnumber() {
		return Idnumber;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setIDnumber(int Idnumber) {
		this.Idnumber = Idnumber;
	}
		
}
