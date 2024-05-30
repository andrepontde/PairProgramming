import java.util.Scanner;

public class MessageEncoderApp{
	public static void main(String args[]){

	String word, cryptic;

	Scanner userInput = new Scanner(System.in);
	MessageEncoder myApp = new MessageEncoder();

	System.out.println("Word: ");
	word = userInput.next();

	myApp.setWord(word);
	myApp.compute();

	cryptic = myApp.getWord();
	System.out.println(cryptic);



	}
}