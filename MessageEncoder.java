/*Message Encoder (Exam Paper 2012/2013)
Develop an application that accepts a one word message from the user as input.
The application should then encode and output the word by reversing the word
and replacing all of the vowels with numbers as follows: a = 1, e = 5, i = 9, o =
15 and u = 21.
For example, Programming becomes gn9mm1rg15rP.
*/

public class MessageEncoder{
	private String word, cryptic;
	StringBuffer strBuff = new StringBuffer();

	public void setWord(String word){
		this.word = word;
	}

	public void compute(){
		for (int i = 0; i < word.length(); i++){
			if (word.charAt(i) == 'a'){
				strBuff.append('1');
			}else if (word.charAt(i) == 'e'){
				strBuff.append('5');
			}else if (word.charAt(i) == 'i'){
				strBuff.append('9');
			}else if (word.charAt(i) == 'o'){
				strBuff.append("15");
			}else if (word.charAt(i) == 'u'){
				strBuff.append("21");
			}else {
				strBuff.append(word.charAt(i));
			}
		}

		cryptic = strBuff.toString();
	}


	public String getWord(){
		return cryptic;
	}

}