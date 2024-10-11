package Assignment1;

public class SalesAgent extends SalesPeople {
	
	// constructors - super class
	public SalesAgent() {
		super();
	}
	public SalesAgent(String firstName, String lastName, String ppsNumber) {
		super(firstName, lastName, ppsNumber);
	}
	
	// commission for salesAgent
	public void calculateCommission() {
		commission = sales * SALES_AGENT_COMMISSION;
	}

}
