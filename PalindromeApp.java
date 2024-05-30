import javax.swing.JOptionPane;

public class PalindromeApp{
	public static void main (String args[]){
		String word;
		boolean palindrome = true;
		Palindrome myApp = new Palindrome();

		myApp.setWord(JOptionPane.showInputDialog(null, "Word: "));

		myApp.compute();

		palindrome = myApp.getPalindrome();

		if (palindrome){
			JOptionPane.showMessageDialog(null, "It is a palindrome");
		}else {
			JOptionPane.showMessageDialog(null, "NOT a palindrome");
		}


	}
}