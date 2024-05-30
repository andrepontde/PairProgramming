import java.util.Scanner;

public class RainFallApp{
	public static void main(String args[]){
		Scanner userInput =new Scanner(System.in);

		int min, total;
		int weather[][] = new int[2][7];


		RainFall myApp = new RainFall();

		for (int i = 0; i< weather.length; i++){
			for(int j = 0; j < weather[i].length;j++){
				System.out.println("Enter the weather for this day");
				weather[i][j] = userInput.nextInt();
			}

		}

		myApp.setRainFall(weather);
		myApp.compute();
		System.out.println("The min is: " + myApp.getMin());
		System.out.println("The total is: " + myApp.getTotal());


	}
}