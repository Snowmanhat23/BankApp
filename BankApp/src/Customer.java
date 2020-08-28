
public class Customer {
	
	/*
	 * Daniel Raskin 
	 * 8/28/20
	 * Coding 501
	 * This program will store user info
	 * 
	 */
	//Field Variables
	// Properties (Variables from a class)
	private String fName, lName, email; 
	private String address, city, state, phone; 
	private int zip;
	//Class property
	private Accounts account;
	
	
	
	public Customer() {
	account = new Accounts();	
	} // End of Default Constructor
	
	//Non Default Constructor, different signature
	public Customer(String firstName, String lastName, String Email, String Address, String City, String State, String Phone, int Zip) {
		
			//No need to use .this because variables are spelled differently
			fName = firstName;	lName = lastName;
			email = Email;		address = Address;
			city = City;		state = State;
			phone = Phone;		zip = Zip;
			account = new Accounts();
		
	}//End of Non- Default Constructor
	
	public Customer(String firstName, String lastName, String userName, String password) {
		fName = firstName;	lName = lastName;
		account = new Accounts(userName, password);
	}
	public String toString()
	{
		String str =  "First Name: " + fName + "\n" + "Last Name:" + lName + "\n";
		return str;
	}// End of toString
	
	//Accessors and Mutators (Gets and Sets)
	public String getFirstName() {return fName;}
	public void setFirstName(String firstName) {fName = firstName;}
	
	public String getLastName() {return lName;}
	public void setLastName(String lastName ) {lName = lastName;}
	
	public String getEmail() {return email;}
	public void setEmail(String Email) {email = Email;}
	
	public String getAddress() {return address;}
	public void setAddress(String Address ) {address = Address;}
	
	public String getCity() {return city;}
	public void setCity(String City) {city = City;}
	
	public String getState(String State) {return state;}
	public void setState(String State ) {state = State;}
	
	public int getZip(int Zip) {return zip;}
	public void setZip(int Zip) {zip = Zip;}
}//End of Class
