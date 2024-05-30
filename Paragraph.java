/*4. Paragraph
Take 2 or 3 sentences in from the user. Add them together to start making a
paragraph, if there is no full stop, add it in and a space before the next
sentence begins. Use StringBuffers to do this.*/

public class Paragraph{
	private String sentence, paragraph;
	StringBuffer strBuff = new StringBuffer();

	public void setSentence(String sentence){
		this.sentence = sentence;
	}

	public void compute(){
		if (sentence.charAt((sentence.length() - 1)) != '.'){
			strBuff.append(sentence);
			strBuff.append(". ");
		}else{
			strBuff.append(sentence);
		}
	}

	public void makeString(){
		paragraph = strBuff.toString();
	}

	public String getParagraph(){
		return paragraph;
	}

}