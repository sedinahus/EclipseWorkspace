package GeometricShapes;

public class PolymorphismDemo {
	public static void main(String[] args) {
		GeometricObject object = new Circle(1, "Red", false);
		GeometricObject object2 = new Circle();
		Circle object3 = new Circle(1, "Blue", true);
		Circle object4 = new Circle();
		
		
		displayObjects(object);
		displayObjects(object2);
		displayObjects(object3);
		displayObjects(object4);
		
		
		//or you can type like ... displayObjects(new Circle(1, "red", false));
	}
	
	public static void displayObjects(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + ", Color is " + object.getColor());
	}
}
