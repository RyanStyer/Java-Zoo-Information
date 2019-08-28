//Customer data class
import java.util.Scanner;
class customer {
	//Declaring variable integers and strings to be passed to functions
	private String firstName, lastName, address, phoneNum, customerNum;
	//Initiating scanner to scan input into variables
	Scanner s = new Scanner(System.in);
//Function scanning string data input into variables. The customer number must scan in an integer
void getCustomerData() {
	System.out.println("Enter customer first name: ");
	firstName = s.nextLine();
	System.out.println("Enter customer last name: ");
	lastName = s.nextLine();
	System.out.println("Enter customer address: ");
	address = s.nextLine();
	System.out.println("Enter customer phone number: ");
	phoneNum = s.nextLine();
	System.out.println("Enter customer number: ");
	customerNum = s.nextLine();
}
//This function displays string and integer inputs for the customer class getCustomerData() function.
void displayCustomerData() {	
	System.out.println("\nTest for Customer Database");
	System.out.println("__________________________");
	System.out.println("First name: " + firstName);
	System.out.println("Last name: " + lastName);
	System.out.println("Address: " + address);
	System.out.println("Phone number: " + phoneNum);
	System.out.println("Customer number: " + customerNum + "\n");
}
}
