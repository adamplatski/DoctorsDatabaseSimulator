/*
 * Name: Adam Plater-Zyberk
 * Student Number: 040 922 567
 * Course: CST8110
 * Semester: S20
 * Assignment 4
 * Due date: Sunday August 9th, 2020 by 11:59pm
 */
import java.util.Scanner;
import java.time.LocalDate;

public class assign4{
	
	//main method to execute Patient class
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//declaring local variables to keep track of patient count
		int NumPatients;
		final int maxNumPatients = 4;

		Patient[] patient = new Patient[maxNumPatients];
		
		
		//populating array with client data
		patient[0] = new Patient("Robert Kubica", 100, LocalDate.of(1985, 8, 25));
		patient[1] = new Patient("Nico Hulkenberg", 101, LocalDate.of(1990, 5, 15));
		patient[2] = new Patient("Max Verstappen", 102, LocalDate.of(1995, 10, 20));
		NumPatients = 3;

		System.out.println("Medical Clinic Patient Tracker System\n");

		int selection = 0;

		//presenting user a menu of choices 
		while(selection !=5) {

			System.out.println("***************************");
			System.out.println("1. ADD PATIENT");
			System.out.println("2. LIST PATIENTS");
			System.out.println("3. SEARCH FOR PATIENT WITH HEALTH CARD NUMBER");
			System.out.println("4. SEARCH FOR PATIENT WITH NAME");
			System.out.println("5. EXIT");
			System.out.println("***************************\n");
			System.out.print("CHOICE: ");

			selection = input.nextInt();

			//displaying input prompts if user chooses to add patient info
			if (selection == 1) {

				if(NumPatients <4) {


					System.out.print("ENTER PATIENT NAME: ");
					String name=input.next();  


					System.out.print("ENTER PATIENT HEALTH CARD NUMBER: ");
					int cardNumber=input.nextInt();

					System.out.println("ENTER PATIENT DATE OF BIRTH: \n");

					System.out.print("YEAR: ");
					int year = input.nextInt();
					System.out.print("MONTH: ");
					int month = input.nextInt();
					System.out.print("DAY: ");
					int day = input.nextInt();

					LocalDate birthDate = LocalDate.of(year, month, day);

					NumPatients++;

					patient[3] = new Patient(name,cardNumber,birthDate);

				}
				
				else {
					System.out.print("No more patients may be added");
				}
			}
			
			//options to display patient information
			else if (selection == 2) {

				if(NumPatients > 0) {
					System.out.println("PATIENT LIST:\n");
					for (int i = 0; i < NumPatients; i++) 
						System.out.println(patient[i]);

				} else {
					System.out.println("There are no patients.");
				}
			}
			
			//option to search patient by health card number
			else if (selection == 3) {
				boolean result = false;
				NumPatients = 0;

				System.out.print("ENTER PATIENT HEALTH CARD NUMBER: ");
				int cardNumber = input.nextInt();

				for (int i = 0; i < patient.length; i++) {
					if (cardNumber == patient[i].getHealthCardNumber()) {
						result = true;
						NumPatients = i;
						i = patient.length;
					} else {
						result = false;
					}
				}
				if (result) {
					System.out.println(patient[NumPatients].getName() + " IS IN THE SYSTEM\n");
				} else {
					System.out.println("PATIENT NOT FOUND\n");
				}
			}

			//option to search patient by name
			else if (selection == 4) {

				boolean result = false;


				System.out.print("ENTER PATIENT NAME: ");
				input.nextLine();
				String name = input.nextLine();


				for (int i = 0; i < patient.length; i++) {
					if (name.equals(patient[i].getName())) {
						result = true;
						NumPatients = i;
						i = patient.length;     // get out of loop
					} else {
						result = false;
					}
				}

				if (result) {
					System.out.println(patient[NumPatients].getName() + " IS IN THE SYSTEM\n");
				} else {
					System.out.println("PATIENT NOT FOUND\n");
				}

			}
			
			//option to quit program
			else if (selection == 5) {
				System.out.println("Goodbye.");
			}
			else {
				System.out.print("entry option is invalid\n");
			}
		}
		input.close();
	}

}
