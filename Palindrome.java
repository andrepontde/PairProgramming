public class Palindrome{
	private String word, reversed;
	private boolean isPalindrome = true;
	StringBuffer strBuff = new StringBuffer();

	public void setWord(String word){
		this.word = word;
	}

	public void compute(){
		for (int i = 0; i < word.length(); i++){
			strBuff.append(word.charAt(word.length() - i - 1));
		}
		reversed = strBuff.toString();
		System.out.println(reversed);

		for (int i = 0; i < word.length(); i++){

			if (word.charAt(i) == reversed.charAt(i)){

			}else{
				isPalindrome = false;
				break;
			}
		}
	}

	public boolean getPalindrome(){
		return isPalindrome;
	}
}