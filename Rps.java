public class Rps{
	String answer, computer;
	int compCalc;

	public void setAnswer(String answer){
		this.answer = answer;
	}

	public void computeWin(){

		compCalc = (int)(Math.random() * (3 - 1 + 1) + 1);
		if (compCalc == 1){
			computer = "s";
		}else if (compCalc == 2){
			computer = "p";
		}else if (compCalc == 3){
			computer = "r";
		}else{
			System.out.println("Not a valid input");
		}


		if (answer.equalsIgnoreCase(computer)){
			System.out.println("Draw!");
		}else if ((answer.equalsIgnoreCase("s"))&&(computer.equals("p"))){
			System.out.println("You won! The computer chose: " + computer);
		}else if ((answer.equalsIgnoreCase("p"))&&(computer.equals("r"))){
			System.out.println("You won! The computer chose: " + computer);
		}else if ((answer.equalsIgnoreCase("r"))&&(computer.equals("s"))){
			System.out.println("You won! The computer chose: " + computer);
		}else if ((answer.equalsIgnoreCase("s"))&&(computer.equals("r"))){
			System.out.println("You lost! The computer chose: " + computer);
		}else if ((answer.equalsIgnoreCase("p"))&&(computer.equals("s"))){
			System.out.println("You lost! The computer chose: " + computer);
		}else if ((answer.equalsIgnoreCase("r"))&&(computer.equals("p"))){
			System.out.println("You lost! The computer chose: " + computer);
		}else{
			System.out.println("Not a valid input");
		}




	}



}