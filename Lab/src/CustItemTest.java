public class CustItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer aCustomer = new Customer(100, "John", "Doe", "jdoe@email.com");
		

		RetailItem[] items = new RetailItem[5];
		
		items[0]  = new RetailItem("jacket", 12, 59.95);
		items[1] =  new RetailItem("DesignerJeans", 40, 34.95);
		items[2]  = new RetailItem("Shirt", 20, 24.95);
		items[3]  = new RetailItem("Hat", 15, 24.50);
		items[4]  = new RetailItem("Gloves", 45, 16.23);
		
	for(int i = 0; i < items.length; i++)
		System.out.println(items[i].getDescriptionItem() + " " + items[i].getPriceItem() + " " + items[i].getUnitsOnHand() + " ");
		
	//for(int i = 0; i < items.length; i++)
		//System.out.println(items[i]);
	//print customer info
	//System.out.println(aCustomer);

	}

}
