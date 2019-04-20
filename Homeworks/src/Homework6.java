//sedina husanovic
public class Homework6 {
	// fields
	private String description;
	private int unitsOnHand;
	private double price;

	// constuctors
	public Homework6(String itemDescription, int itemUnits, double itemPrice) {
		description = itemDescription;
		unitsOnHand = itemUnits;
		price = itemPrice;
	}

	// accessor methods
	public String getDescriptionItem() {
		return description;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public double getPriceItem() {
		return price;
	}

}
