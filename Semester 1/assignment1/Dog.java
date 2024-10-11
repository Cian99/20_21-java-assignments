package assignment1;

public class Dog { // no main method 
	
	// instance variables
	private String size;
	private String breed;
	private String name;
	
	// constructor
	public Dog() {
		size = "Size = 0";
		breed = "Breed = unassigned";
		name = "Name = unassigned";
	}
	
	// getters
	public String getSize() {
		return size;
	}
	public String getBreed() {
		return breed;
	}
	public String getName() {
		return name;
	}
	
	// setters
	public void setSize(String size) {
		this.size = size;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// behavior
	public String bark() {
		return "Ruff! Ruff!";
	}
} // end of class
