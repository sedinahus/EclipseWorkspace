package FamilyTree;

public class FamilyTreeTester {
	public static void main (String[] args) {
	
		Person ww = new Person(new Name("William", "Windsor"), 'M');
	
		Person cw = new Person(new Name("Charles", "Windsor"), 'M');
	
		Person ds = new Person(new Name("Diana", "Spencer"), 'F');
		
		Person es = new Person(new Name("Edward", "Spencer"), 'M');
	
		Person ew = new Person(new Name("Elizabeth", "Windsor"), 'F');
	
		Person pw = new Person(new Name("Philip", "Mountbatten"), 'M');
	
		Person eb = new Person(new Name("Elizabeth", "Bowes-Lyon"), 'F');
	
		Person gw = new Person(new Name("George", "Windsor"), 'M');
	
		ww.setFather(cw);
		ww.setMother(ds);
		
		ds.setFather(es);
		
		cw.setMother(ew);
		cw.setFather(pw);
		
		ew.setMother(eb);
		ew.setFather(gw);
		
		System.out.println(ww);
		
	}
}
