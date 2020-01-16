/**
 * 
 * class: Main.java
 * this main class will do demonstration of late binding example
 * by using sale and discountsale
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		 Sale simple = new Sale("Floor Mat", 10.00);
		 DiscountSale discount = new DiscountSale("Floor Mat", 11, 10);
		 
		 System.out.println(simple);
		 System.out.println(discount);
		 
		 if(discount.lessThan(simple)) {
			 System.out.println("Discounted item is cheaper!");
		 }
		 else System.out.println("Discounted item is not cheaper!");
		 
		 Sale simpleX = new Sale("Cup Holder", 9.9);
		 DiscountSale discountX = new DiscountSale("Cup Holder", 11, 10);
		 
		 System.out.println(simpleX);
		 System.out.println(discountX);
		 if(discountX == discount) {
			 System.out.println("Deals are not equal.");
		 }
		 else System.out.println("Deals are equal.");
	}

}
