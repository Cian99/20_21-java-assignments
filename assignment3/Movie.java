package assignment3;

public class Movie {
	
	// private instance variables
	private String title;
	private String genre;
	private int rating;
	
	// constructor
	Movie(){
		title = "Unassigned";
		genre = "Unassigned";
		rating = 0;
	}
	
	// getters
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public int getRating() {
		return rating;
	}
	
	// setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	// toString - useful for outputting content to the screen
	@Override
	public String toString() {
		return "Movie Title: " + getTitle() + "\nMovie Genre: " + getGenre() + "\nMovie Rating: " + getRating();
	}
	
	void playIt() {
		System.out.println(getTitle() + " - Now Playing");
	}

}
