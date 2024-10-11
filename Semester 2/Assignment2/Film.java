package Assignment2;

// film is the superclass 
public abstract class Film { 
	
	// the numberOfFilms static int is required in order to increment the ID number successfully 
	private static int numberOfFilms = 0;
	private int idNumber;
	private String title;
	private String classification;
	
	// constructor and overloaded constructor
	public Film() {
		this("Unassigned", "Unassigned");
		numberOfFilms++;
		idNumber = numberOfFilms;
	}
	public Film(String title, String classification) {
		this.title = title;
		this.classification = classification;
		numberOfFilms++;
		idNumber = numberOfFilms;
	}
		
	// setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
		
	// getters
	public String getTitle() {
		return title;
	}
	public String getClassification() {
		return classification;
	}
		
	// toString
	@Override
	public String toString() {
		return "\nMovie ID: " + idNumber + "\nMovie Title: " + getTitle() + "\nMovie Classification: " + getClassification();
	}
	
	// late fee method
	abstract double calculateLateFee(int numDaysLate);

}
