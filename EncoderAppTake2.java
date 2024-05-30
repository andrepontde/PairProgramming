import java.util.Scanner;

public class EncoderAppTake2{
	public static void main(String args[]){
		String word, encrypted;
		EncoderTake2 myApp = new EncoderTake2();
		Scanner userInput = new Scanner(System.in);

		word = userInput.next();
		myApp.setWord(word);
		myApp.compute();

		encrypted = myApp.getCryptic();
		System.out.println(encrypted);

	}
}