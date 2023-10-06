package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 8;
	private int mailBoxCapacity = 1000;
	private String alternateEmail;
	private String companysuffix = "lionelINC.com";
	
	//contrutor to recieve the first name and lastname;
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("email created:"+this.firstName + " "+this.lastName);
		
		// Call a method asking for the department - return the department
		this.department= setDepartment();
		//System.out.println("Department:" + this.department);
		
		
		// call a method that return a random password.
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is:  " +this.password);
		
		// combine element
		email = firstName.toLowerCase() + "."+ lastName.toLowerCase()+"@"+ department+"."+companysuffix;
		System.out.println("your email is:  "+ email);
	}
	
	
	//ask for the department
	private String setDepartment() {
		System.out.print("department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1 ){
			return "sales";
		}
		else if (depChoice == 2) {
			return "dev";
		}
		else if (depChoice == 3) {
			return "Acc";
		}
		else {
			return "";
		}
	}
	
	
	// generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIGKLMNOPQURSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		
		for (int i =0; i<length; i++){
			int rand =(int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
		}
	
	
	
	
	//set the mailbox capacity
	public void SetMailboxCapacity (int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	
	
	//set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	
	//change the password
	
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailBoxCapacity(){
		return mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName +" "+lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailBoxCapacity +"GB";
						
	}

}
