
public class SalariedEmployee extends Employee {
	private double salary;
	
	//public abstract double getPay();
	public double getPay() {
		return salary / 12;
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		else if (getClass() != otherObject.getClass()) return false;
		else {
			SalariedEmployee se = (SalariedEmployee)otherObject;
			return super.equals(se) && (salary == se.salary);
		}
	}
}
