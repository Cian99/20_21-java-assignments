package Assignment1;

public interface Commission {
	
	// commission for sales employees and agents
	static final double SALES_EMP_COMMISSION = 0.15;
	static final double SALES_AGENT_COMMISSION = 0.10;
	
	// no method body in interface 
	void calculateCommission();

}
