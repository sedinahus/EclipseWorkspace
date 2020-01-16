import java.util.Date;

public abstract class Employee {
	//name
	//hireDate
	
	private String name;
	private Date hireDate;
	
	//constructor
	
	public Employee() {
		name = "Not Entered";
		hireDate = new Date(); //a place holder
	}
	
	public boolean samePay(Employee obj) {
		if(obj == null) {
			System.out.println("Error! Null object");
			System.exit(0);
		}
		return this.getPay() == obj.getPay(); 
	}
	
//	public boolean equals(Object o) {
//		if(o == null) return false;
//		else if(getClass() != o.getClass())
//			return false;
//		else {
//			Employee e = (Employee)o;
//			return name.equals(o.name) && ;
//		}
	//}
	
	public abstract double getPay();
	
	public boolean equals(Employee otherEmployee) {
		return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else if(getClass() != obj.getClass()) return false;
			Employee otherEmployee = (Employee)obj;
			return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
	}
		
	
}

