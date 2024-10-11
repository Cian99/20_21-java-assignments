package Assignment2;

// subclass of film
public class Drama extends Film {
	
	// constructors - with title and classification
	public Drama() {
		super();
	}
	public Drama(String title, String classification) {
		super(title, classification);
	}
		
	// overridden late fee method - 3 euro per day for Drama
	double calculateLateFee(int numDaysLate) {
		return numDaysLate * 3;
	}

}
