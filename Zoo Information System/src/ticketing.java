//Class calculating and displaying ticket sales for accounting
import java.text.DecimalFormat;
import java.util.Scanner;

public class ticketing {
	
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	//Declaring variables to pass input for ticket numbers and total money sold for children and adults
	private int ticketNumA, ticketNumC;
	private double totalAdult; 
	private double totalChild;
	 
	
	//Initiating scanner to scan input into variables
	Scanner s = new Scanner(System.in);
	
//Function taking input and calculating totals	
void getTicketData() {
	
	System.out.println("Enter number of adult tickets sold for the day: ");
	ticketNumA = s.nextInt();
	totalAdult = ticketNumA * 17.50;
	
	System.out.println("Enter number of child tickets sold for the day: ");
	ticketNumC = s.nextInt();
	totalChild = ticketNumC * 11.50;
}
//Function displaying calculated totals to be sent to the database class
void displayTicketData() {
	

	System.out.println("Test for Ticketing Database");
	System.out.println("___________________________");
	System.out.println("Adult tickets sold: " + ticketNumA);
	System.out.println("Child tickets sold: " + ticketNumC);
	System.out.println("Total money from adult tickets sold: " + df.format(totalAdult));
	System.out.println("Total money from child tickets sold: " + df.format(totalChild));
}
}
