
import java.util.Scanner;
public class HotelBooking{
public static void main (String []args){

Scanner userInput = new Scanner(System.in);

System.out.println("How many people wish to stay :");

int amountPeople = userInput.nextInt();

System.out.println("How many nights do you wish to stay :");

int amountNights = userInput.nextInt();

 int totalAmount = ((amountPeople * amountNights)*60);

 System.out.printf("The final amount is equal to : %d \n", totalAmount);





}
}