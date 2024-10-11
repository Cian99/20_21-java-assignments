package Assignment1;

public abstract class SalesPeople implements Commission {
	
	// fields
	private String firstName;
	private String lastName;
	private String ppsNumber;
	protected double sales;
	protected double commission;
	protected String type;
	
	// constructor
	public SalesPeople() {
		this("Unassigned", "Unassigned", "Unassigned");
	}
	public SalesPeople(String firstName, String lastName, String ppsNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppsNumber = ppsNumber;
	}
	
	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPPS(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	
	// getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPPS() {
		return ppsNumber;
	}
	
	// toString
	@Override
	public String toString() {
		return "\nName: " + getFirstName() + " " + getLastName() + "\nPPS Number: " + getPPS() + "\nEmployee Type: " + type + "\nSales: " + sales + "\nCommission: " + commission;
	}
	
}
