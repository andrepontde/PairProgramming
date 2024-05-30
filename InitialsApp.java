import java.util.Scanner;

public class InitialsApp{
	public static void main (String args[]){
		String name, initials;

		Initials myApp = new Initials();

		Scanner userInput = new Scanner(System.in);

		System.out.println("Name: ");
		name = userInput.nextLine();

		myApp.setName(name);
		myApp.compute();

		initials = myApp.getInitials();
		System.out.println(initials);

	}
}