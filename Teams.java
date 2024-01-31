/**
	Authors: André Pont, Jordan Carthy.
	Teams.Java
	23/01/2024
**/
import java.util.Scanner;
//We import the scan function.

public class Teams{
	public static void main (String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please input the number of students");
		int students = userInput.nextInt();
		//We divide the user input between 5 so we have another variable with the result.
		int studentsDivided = students/5;
		System.out.printf("The number of students is %d and the number of possible teams is: %d \n", students, studentsDivided);
	}
}