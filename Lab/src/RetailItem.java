public class RetailItem {
	private String descriptionItem;
	private int unitsOnHand;
	private double priceItem;
	
	//Constructors
	public RetailItem(String description, int units, double price)
	{
		descriptionItem = description;
		unitsOnHand = units;
		priceItem = price;
	}

	//Methods
		public String getDescriptionItem()
		{
			return descriptionItem;
		}
		public int getUnitsOnHand()
		{
			return unitsOnHand;
		}
		public double getPriceItem()
		{
			return priceItem;
		}
	
		public void setDescription(String Jacket)
		{
			 descriptionItem = Jacket;
		}
		
		public void setUnits(int type)
		{
			unitsOnHand = type ;
		}
		
		public void setPriceItem(double type)
		{
			priceItem = type;
		}
	
	
	
}
