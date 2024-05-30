import java.util.Scanner;

public class ParagraphApp{
	public static void main (String args[]){
		String sentence, paragraph;
		String keepTalking = "y";
		Paragraph myApp = new Paragraph();

		Scanner userInput = new Scanner(System.in);



		do{

			System.out.println("Give a sentence: ");
			sentence = userInput.nextLine();

			myApp.setSentence(sentence);
			myApp.compute();

			System.out.println("Do you want to give another sentence?");
			keepTalking = userInput.nextLine();


		} while (keepTalking.equalsIgnoreCase("y"));

		myApp.makeString();

		paragraph = myApp.getParagraph();

		System.out.println(paragraph);


	}
}