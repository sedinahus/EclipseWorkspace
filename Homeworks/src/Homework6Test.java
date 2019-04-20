/**
 * 
 */

/**
 * @author sedina
 *
 */
public class Homework6Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework6[] items = new Homework6[5];
		items[0] = new Homework6("Jacket", 12, 59.95);
		items[1] = new Homework6("Designer Jeans", 40, 34.95);
		items[2] = new Homework6("Shirt", 20, 24.95);
		items[3] = new Homework6("Designer Shit", 5000, .99);
		items[4] = new Homework6("Non-Designer Jeans", 10, 15.99);
		for (int i = 0; i < items.length; i++)
			System.out.println("Item description: " + items[i].getDescriptionItem() + " Item price: "
					+ items[i].getPriceItem() + " Quantity on hand: " + items[i].getUnitsOnHand());

	}

}
