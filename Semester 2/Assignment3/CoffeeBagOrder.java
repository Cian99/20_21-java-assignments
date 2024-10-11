package Assignment3;

// this class extends order and implements methods from the sales interface
public class CoffeeBagOrder extends Order implements SalesInterface {
	
	// data member
	private final static double PRICE_PER_KG = 5.55;
	
	// constructor - using the superclass
	public CoffeeBagOrder() {
		super();
	}
	
	// getter for price per kg
	public double getPricePerKg() {
		return PRICE_PER_KG;
	}
	
	// 3 methods - for the calculations 
	public double calculateSalesBeforeTax() {
		return getUnitWeight() * getNumberOfUnits() * getPricePerKg();
	}
	public double calculateSalesTax() {
		return calculateSalesBeforeTax() * getSalesTax();
	}
	public double calculateTotalSales() {
		return calculateSalesBeforeTax() + calculateSalesTax();
	}
	
	// toString - to print out the required data in an organized format 
	// sales tax is multiplied by 100 to display as a percentage
	@Override
	public String toString() {
		return "Number of Bags Sold: " + getNumberOfUnits() + "\nWeight per bag: " + getUnitWeight() + "\nPrice per kilo: " + getPricePerKg() + "\nSales Price: " + calculateSalesBeforeTax() + "\nSales Tax Rate: " + getSalesTax() * 100 + "\nSales Tax: " + calculateSalesTax() + "\nTotal Price: " + calculateTotalSales();
	}

}
