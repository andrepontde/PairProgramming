import java.util.Scanner;

public class RpsApp{

		public static void main(String args[]){
		String answer, answAgain;

		Scanner userInput = new Scanner(System.in);

		Rps myApp = new Rps();

		answAgain =  "y";

		while (answAgain.equalsIgnoreCase("y")){

			for(int i = 1; i <= 3; i++){
				System.out.println("What is your asnwer?");

				answer = userInput.next();
				myApp.setAnswer(answer);
				myApp.computeWin();

			}

			System.out.println("Do you want to play again?");
			answAgain = userInput.next();

		}


	}





}