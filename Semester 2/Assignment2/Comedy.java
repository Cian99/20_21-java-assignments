package Assignment2;

//subclass of film
public class Comedy extends Film {
	
	// constructors - with title and classification
	public Comedy() {
		super();
	}
	public Comedy(String title, String classification) {
		super(title, classification);
	}
		
	// overridden late fee method - 4 euro per day for Comedy
	double calculateLateFee(int numDaysLate) {
		return numDaysLate * 4;
	}

}
