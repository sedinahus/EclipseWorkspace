
public class Customer {

	// Field
			private int id;
			private String firstName;
			private String lastName;
			private String email;
			
			
			
		//Constructor 
			public Customer(int i, String fn, String ln, String ema)
			{
				 int findId = i;
				 String findFirstName = fn;
				 String findLastName = ln;
				 String findEmail = ema;
			}
			
			
		
			
		// getMethods	
		public int getId()
		{
			return id;
		}
		
		public String getFirstName()
		{
			return firstName;
		}
		
		public String getLastName()
		{
			return lastName;
		}
		
		public String getEmail()
		{
			return email;
		}
		// set Method
		public void setId(int i)
		{
			   id =  i ;
		}
		
		public void setFirstName(String fn)
		{
			firstName = fn;
		}
		
		public void setlastName(String ln)
		{
			lastName = ln ;
		}
		
		public void setemail(String ema)
		{
			email = ema ;
		}
		// toString Method
		public String toString()
		{
			return "ID: " + getId() + "Name: " + getFirstName() + " " + getLastName();
		}
	
}
