
public class Sale {
	private String name ; //non-empty string
	private double price;
	
	public Sale() {
		name = "No name yet";
		price = 0;
		
	}
	public Sale(String theName, double thePrice) throws Exception {
		setName(theName);
		setPrice(thePrice);
	}
	
	public Sale(Sale originalObject) {
		if(originalObject == null) {
			System.out.println("Error. NULL sale.");
			System.exit(0);
		}
		//else case
		name = originalObject.name;
		price = originalObject.price;
	}
	
	public static void announcement() {
		System.out.println("This is the sale class");
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setName(String newName) throws Exception {
		if(newName != null && newName != "")
			name = newName;
		else{
			throw new Exception("Error - must not be an empty string or not null");
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) throws Exception {
		if(newPrice >= 0) {
			price = newPrice;
		}
		else {
			throw new Exception("Error: price should not be negative.");
		}
	}
	
	public String toString() {
		return name + " price and total cost is = $" + price;
	}
	public double bill() {
		return price;
	}
	/**
	 * return true if the names are the same and the bill for the object you are calling is equal to the bill for the other sale
	 * otherwise, it will return false also return false if the other object is null
	 */
	public boolean equalDeals(Sale otherSale) {
		if(otherSale == null)
			return false;
		else 
			return (name.contentEquals(otherSale.name) && bill() == otherSale.bill());
		//when equalDeals method are called this will use the definition of the method bill that is appropriate for each of the objects
	}
	public boolean lessThan(Sale otherSale) {
		if(otherSale == null) {
			System.out.println("Error: Null sale");
			System.exit(0);
		}
		return (bill() < otherSale.bill());
	}
	public boolean equals(Object otherObject) {
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else {
			Sale otherSale = (Sale) otherObject;
			return(name.contentEquals(otherSale.name) && (price == otherSale.price));
		}
	}
	

}
