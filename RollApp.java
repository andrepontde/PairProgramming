


import java.util.Scanner;

public class RollApp{
	public static void main (String args[]){
		String answer, again;

		answer = "yes";

		Scanner userInput = new Scanner(System.in);

		Roll myApp = new Roll();

		while (answer.equalsIgnoreCase("yes")){
			myApp.compute();
			answer = myApp.getAnswer();

			System.out.println("The roll is: " + answer);

			System.out.println("Would you like to roll again?");
			answer = userInput.next();

		}


	}
}