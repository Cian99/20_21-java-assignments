package assignment4;

public class Student {
	
	private String name;
	private long idNumber;
	
	// constructor
	public Student() {
		this("Unassigned", 0);
	}
	
	// overloaded constructor
	Student(String name, long idNumber){
		this.name = name;
		this.idNumber = idNumber;
	}
		
	// getters
	public String getName() {
		return name;
	}
	public long getidNumber() {
		return idNumber;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setidNumber(long idNumber) {
		this.idNumber = idNumber;
	}
	
	// toString - useful for outputting content to the screen
		@Override
		public String toString() {
			return "Student name: " + getName() + " & student IDnumber: " + getidNumber();
		}

}
