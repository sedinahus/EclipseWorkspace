/**
 * @author sedina
 * class for a sale of one item with discount expressed by percent of the price
 * but there is no other adjustments
 * price must not be negative
 * Name must not be empty
 * discount must be non-negative
 */
public class DiscountSale extends Sale{
	private double discount; //percent of the price must not be negative
	
	public DiscountSale() {
		super(); //if this is deleted, then nothing unchanged (inherits from sale)
		discount = 0;
	}
	
	public DiscountSale(String name, double thePrice, double theDiscount) throws Exception {
		super(name, thePrice);
		setDiscount(theDiscount);
	}
	
	public DiscountSale(DiscountSale originalObject) {
		super(originalObject);
		discount = originalObject.discount;
	}
	public static void announcement() {
		System.out.println("This is the sale class");
	}
	
	public double bill() {
		double fraction = discount / 100;
		return(1 - fraction) * getPrice();
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double newDiscount) {
		if(newDiscount >= 0)
			discount = newDiscount;
		else {
			System.out.println("Error: Negative discount.");
			System.exit(0);
		}
	}
	public String toString() {
		return getName() + " price = $" + getPrice() + " Discount = " + discount + "%" + " Total cost = $" + bill();
	}
	

}
