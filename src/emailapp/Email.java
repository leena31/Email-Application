package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailBoxCapacity= 500;
	private String alternateEmail;
	private int defaultPasslen =7;
	private String email;
	private String companyName = "mycomp.com";
	



// Constructor to receive the first name and last name
public Email(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	
	
	// call to receive departmentcode and return department 
	
	this.department = letDepartment();
	
	
	//combine elements for email  firstname.lastname@department.company.com
	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyName; 
	
	
	//random password setting
	this.password = randomPassword(defaultPasslen);
}
	



//Ask for the department

public String letDepartment() {
	
	System.out.println("NEW EMPLOYEE "+ firstName.toUpperCase() + "\nDEPARTMENT CODES: \n1 for ACCOUNTING \n2 for DEVELOPEMENT \n3 for SALES \n0 for NONE");
	Scanner sc = new Scanner(System.in);
	int depcode = sc.nextInt();
	if (depcode==1)  {return "ACCOUNTING"; }
	else if(depcode==2) { return "DEVELOPEMENT";} 
	else if(depcode == 3) { return "SALES"; }
	else { return "NONE";}
}



// Generate a random password

public String randomPassword(int length) {
	String passwordSet = "123456789!@#$";
	char[] password = new char[length];
	
	for (int i = 0;i<length;i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	}
	return new String(password);
	
}


// set the mailbox capacity
public int getMailBoxCapacity() {
	return mailBoxCapacity;
}

public void setMailBoxCapacity(int mailBoxCapacity) {
	this.mailBoxCapacity = mailBoxCapacity;
}



// set the alternate email
public String getAlternateEmail() {
	return alternateEmail;
}

public void setAlternateEmail(String alternateEmail) {
	this.alternateEmail = alternateEmail;
}


// change the password
public void changePassword(String password) {
	this.password = password;
}
public String getChangePassword() {
	return password;
}
public String showInfo() {
	return "Your Name: " + this.firstName +""+ lastName + 
			"\nYour Company Email: " + email + 
			"\nYour temporary password: " + password + 
			"\nMailbox Capacity: " + mailBoxCapacity + "mb" +
			"\nAlternate email: " + alternateEmail + 
			"\nNew Password: " + getChangePassword();
}

}