package Assignment3;

// this class implements methods from the order interface
public class Order implements OrderInterface {
	
	// data members
	private final static double SALES_TAX = 0.1;
	private int unitWeight, numberOfUnits;
	
	// constructor - simple and default
	public Order() {
		unitWeight = 0;
		numberOfUnits = 0;
	}
	
	// getters - sales tax has only getter as it is static
	public double getSalesTax() {
		return SALES_TAX;
	}
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	public int getUnitWeight() {
		return unitWeight;
	}
	
	// setters - to store the user entered data
	public void numberOfUnits(int number) {
		this.numberOfUnits = number;
	}
	public void unitWeight(int weight) {
		this.unitWeight = weight;
	}

}
