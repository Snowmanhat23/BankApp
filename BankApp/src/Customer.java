
public class Customer {
	
	/*
	 * Daniel Raskin 
	 * 8/28/20
	 * Coding 501
	 * This program will stor user info
	 * 
	 */
	//Field Variables
	// Properties (Variables from a class)
	private String fName, lName, email; 
	private String address, city, state, phone; 
	private int zip;
	
	public Customer() {
		
	} // End of Default Constructor
	
	//Non Default Constructor, different signature
	public Customer(String firstName, String lastName, String Email, String Address, String City, String State, String Phone, int Zip) {
		{
			//No need to use .this because variables are spelled differently
			fName = firstName;	lName = lastName;
			email = Email;		address = Address;
			city = City;		state = State;
			phone = Phone;		zip = Zip;
		}
	}//End of Non- Default Constructor
	public String toString()
	{
		String str =  "First Name: " + fName + "\n" + "Last Name:" + lName + "\n";
		return str;
	}

}//End of Class
