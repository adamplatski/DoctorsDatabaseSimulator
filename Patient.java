
/*
 * Name: Adam Plater-Zyberk
 * Student Number: 040 922 567
 * Course: CST8110
 * Semester: S20
 * Assignment 4
 * Due date: Sunday August 9th, 2020 by 11:59pm
 */
import java.time.LocalDate;

//creating Patient class
public class Patient {

	//declaring instance variables
	private String name;
	private int healthCardNumber;
	private LocalDate birthDate;

	//no argument constructor to assign values to variables
	public Patient(){

		name = "unknown";
		healthCardNumber = 9;
		birthDate = LocalDate.now();
	}
	
	//parameterized constructor 
	public Patient(String name, int healthCardNumber, LocalDate birthDate) {
		this.name = name;
		this.healthCardNumber = healthCardNumber;
		this.birthDate = birthDate;

	}
	
	//returns a string representation of patient information
	public String toString() {
		return "Name: " +this.name+ "\nHealthCard Number: " +this.healthCardNumber+ "\nBirth Date: " +this.birthDate+ "\n";
	}
	
	//returns the field name to search patients by their name
	public String getName() {
		return this.name;
	}
	
	//returns the field name to search patients by their name
	public int getHealthCardNumber() {
		return this.healthCardNumber;

	}
}