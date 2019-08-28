//Class displaying all information input by users.
//This is the main function of the program, bringing all the information together to execute and display outputs.
public class database {
	
public static void main(String []args) {
	
	//classes passed and initialized in new class database.
	customer c = new customer();
	
	animal a = new animal();
	
	ticketing t = new ticketing();
	
	//Running functions within each class to obtain input
	c.getCustomerData();
	a.getAnimalData();
	t.getTicketData();
	
	//Running functions within each class to display output
	c.displayCustomerData();
	a.displayAnimalData();
	t.displayTicketData();
}
}
