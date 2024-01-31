/**
	Authors: André Pont, Jordan Carthy.
	Hotelbooking.Java
	31/01/2024
**/


import java.util.Scanner;
public class HotelBooking{
public static void main (String []args){

//First we call the user input as a Scanner for us to use it later.

Scanner userInput = new Scanner(System.in);

System.out.println("How many people wish to stay :");

//We declare the type of data and the variable to be able to multiply it later.

int amountPeople = userInput.nextInt();

System.out.println("How many nights do you wish to stay :");

int amountNights = userInput.nextInt();

 int totalAmount = ((amountPeople * amountNights)*60);

//We format the output this way so we dont have to concatenate manually.

 System.out.printf("The final amount is equal to : %d \n", totalAmount);





}
}