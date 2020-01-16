
public class PersonTester {

	public static void main(String[] args) {
		Name jo = new Name("Jessica", "Oliver");  //1 person
		Person jessica = new Person(jo, 'F');
		System.out.println("Jessica: " + jessica);
		jessica.name.setMiddle("Forrest");
		
		Name sh = new Name("Sedina", "Husanovic"); // 2nd person
		Person sedina = new Person(sh, 'F');
		System.out.println("Sedina: " + sedina);
		sedina.name.setMiddle("Zemira");
		
		Name hh = new Name("Hannah", "Hadgu"); // 3rd person
		Person hannah = new Person(hh, 'F');
		System.out.println("Hannah: " + hannah);
		hannah.name.setMiddle("Tareke");
		
		Name ss = new Name("Sally", "Seashells"); //4th person
		Person sally = new Person(ss, 'F');
		System.out.println("Sally: " + sally);
		sally.name.setMiddle("Sells");
		
		Name cb = new Name("Carrie", "Bunny"); //5th person
		Person carrie = new Person(cb, 'F');
		System.out.println("Carrie: " + carrie);
		carrie.name.setMiddle("Cute");
		
		
		Person johnny = new Person(new Name("Johnny", "Castro"), 'M'); //1st person
		//System.out.println("Johnny: " + johnny);
		johnny.setId("90078988");
		System.out.println("Johnny: " + johnny);
		
		Person joe = new Person(new Name("Joe", "Mama"), 'M'); // 2nd person
		joe.setId("90012345");
		System.out.println("Joe: " + joe);
		
		Person aleks = new Person(new Name("Aleks", "Harding"), 'M'); //3rd person
		aleks.setId("90038574");
		System.out.println("Aleks: " + aleks);
		
		Person jack = new Person(new Name("Jack", "Bean"), 'M'); //4th person
		jack.setId("90084673");
		System.out.println("Jack: " + jack);
		
		Person bob = new Person(new Name("Bob", "Flamington"), 'M');
		bob.setId("90065396");
		System.out.println("Bob: " + bob);
		
		
		
		
		
		
	}

}
