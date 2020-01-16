
public class HourlyEmployee extends Employee{
	private double wageRate;
	private double hour;
	
	public double getPay() {
		return wageRate * hour;
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		else if(getClass() != otherObject.getClass()) return false;
		else {
			HourlyEmployee he =(HourlyEmployee)otherObject;
			return (super.equals(he) && wageRate == he.wageRate && hour == he.hour);
		}
	}

}
