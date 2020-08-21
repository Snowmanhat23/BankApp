/*
 * Accounts
 * Author : Daniel Raskin
 * Class: Coding 501
 * Date: 8/21/20
 * Purpose: The program will store user info
 * 
 */
import java.util.Random;

public class Accounts {
	private String username, password;
	private int accountNum;
	//Default Constructor | Overriding
	public Accounts()
	{
	
	}

//Non-Default Constructor | Has Parameters
public Accounts(String username, String password) {
	//Base Class
	this.username = username;
	this.password = password;
	Random rand = new Random();
	//Generates a random number between 1 and 999999999 
	accountNum = rand.nextInt(100000000);
}
//Overriding
public String toString() {
	String str = "Account Number: " + accountNum + "\n\nAccount Username: " + username;
	
	
	
	return str;
}

//Accessors & Mutators
//Gets & Sets
public String getUsername() {return username;}
public void setUsername(String username) {this.username = username;}

public String getPassword() {return password;}
public void setPassword(String password) {this.password = password;}

public int getAccountNum() {return accountNum;}




} // End of Class