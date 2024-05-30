public class EncoderTake2{
	//Data members
	private String word, encrypted;
	StringBuffer sb = new StringBuffer();

	public void setWord(String word){
		this.word = word;
	}

	public void compute(){

		for (int i = 0; i <= (word.length()-1); i++){
			if (word.charAt(word.length()-1-i) == 'a'){
				sb.append('1');
			}else if (word.charAt(word.length()-1-i) == 'e'){
				sb.append('2');
			}else if (word.charAt(word.length()-1-i) == 'i'){
				sb.append('3');
			}else if (word.charAt(word.length()-1-i) == 'o'){
				sb.append('4');
			}else if (word.charAt(word.length()-1-i) == 'u'){
				sb.append('5');
			}else {
				sb.append(word.charAt(word.length()-1-i));
			}
		}
		encrypted = sb.toString();
	}


	public String getCryptic(){
		return encrypted;
	}

}