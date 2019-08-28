//Animal data class
import java.util.Scanner;
//Animal data class
class animal {	
	//Declaring string variables for animal data input and scanned in from the user
	private String animalName, animalType, gender, animalLocation, medicalNotes;
	
	//Initiating Java scanner
	Scanner s = new Scanner(System.in);
//Function scanning in user input regarding animals at the zoo
void getAnimalData() {
	System.out.println("Enter the animal name: ");
	animalName = s.nextLine();
	System.out.println("Enter the animal type: ");
	animalType = s.nextLine();
	System.out.println("Enter the gender: ");
	gender = s.nextLine();
	System.out.println("Enter the animal location: ");
	animalLocation = s.nextLine();
	System.out.println("Please enter any medical notes about this animal ");
	medicalNotes = s.nextLine();
}
//Function displaying animal data being sent to database
void displayAnimalData() {
	System.out.println("Test for Animal Database");
	System.out.println("________________________");
	System.out.println("Animal name: " + animalName);
	System.out.println("Animal Type: " + animalType);
	System.out.println("Gender: " + gender);
	System.out.println("Animal location: " + animalLocation);
	System.out.println("Medical notes: " + medicalNotes + "\n");
}
}
