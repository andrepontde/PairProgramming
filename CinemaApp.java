import java.util.Scanner;

public class CinemaApp{
	public static void main(String args[]){
		int price, numOT;
		int age;
		int priceSum = 0;
		String day, ans;

		Scanner userInput = new Scanner(System.in);

		Cinema myApp = new Cinema();

		System.out.println("day");
		myApp.setDay(userInput.next());

		System.out.println("What is the amount of tickets you want to buy?");
		numOT = userInput.nextInt();
		ans = "y";


		while (ans.equalsIgnoreCase("y") && numOT <= 4){

			System.out.println("Age:");
			myApp.setAge(userInput.nextInt());

			myApp.compute();

			System.out.println("The ticket price is ");

			priceSum = myApp.getPrice() + priceSum;

			System.out.println("The price now is: " + priceSum);

		}

		price = priceSum;

		System.out.println("The total price is: " + price);

	}
}