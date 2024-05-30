/*
3. Initials
Write a program that computes your initials from your full name and displays
them. ‘Jo M. Smith’ would be ‘JMS’.
*/

public class Initials{
	private String name, initials;
	StringBuffer strBuff = new StringBuffer();

	public void setName(String name){
		this.name = name;
	}

	public void compute(){
		for (int i = 0; i < name.length(); i++){
			if (i == 0){
				strBuff.append(name.charAt(i));
			}else if (name.charAt(i) == ' '){
				if (name.length() > i+1){
					strBuff.append(name.charAt(i + 1));
				}else{

				}
			}
		}

		initials = strBuff.toString();
	}


	public String getInitials(){
		return initials;
	}



}