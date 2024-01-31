/*
 * TimesTables.java
 * @authors Andre Pont & Jordan Carthy
 * 31/01/2024
 */
import java.util.Scanner;
public class TimesTables{
    public static void main (String []args){
    // Here we ask the user for input using scanner and System.out.println
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey I want you to enter a number");
        int userNumber = userInput.nextInt();
        // Here we created a loop and concatenated the answer in a String.
        for (int i = 0; i < 13; i++){

            System.out.println(i + " Times "  + userNumber + " is " + userNumber*i);
        }
    }
}