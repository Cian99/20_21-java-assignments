package Assignment1;

public class SalesEmp extends SalesPeople {
	
	// constructors - super class
	public SalesEmp() {
		super();
	}
	public SalesEmp(String firstName, String lastName, String ppsNumber) {
		super(firstName, lastName, ppsNumber);
	}
	
	// commission for salesEmployee
	public void calculateCommission() {
		commission = sales * SALES_EMP_COMMISSION;
	}

}
