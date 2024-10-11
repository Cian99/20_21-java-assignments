package assignment6;

//superclass - top of the hierarchy

public class Student {
	
	// data members
	private String name;
	private long id;
	private String grade;
	private int test[];
	private int NUM_TESTS;
	
	// constructors
	public Student() {
		name = "Unassigned";
		id = 0;
		grade = null;
		test = null;
	}
	public Student(String name, long id) {
		this.name = name;
		this.id = id;
		this.NUM_TESTS = 5;
		this.test = new int[NUM_TESTS];
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setID(long id) {
		this.id = id;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setTestScore(int score, int index) {
		this.test[index] = score;
	}
	
	// getters
	public int getTestScore(int index) {
		return test[index];
	}
	public int getNumTests() {
		return NUM_TESTS;
	}
	public String getName() {
		return name;
	}
	public long getID() {
		return id;
	}
	public String getGrade() {
		return grade;
	}
	
	// methods
	@Override
	public String toString() {
		return "Name: " + getName() + ", ID: " + getID();
	}
	
	public void calculateResult() {
	}
	
}
