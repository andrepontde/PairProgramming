public class Roll{
	//Data members;

	private int number1, number2;
	private String answer;



	public void compute(){


		number1 =  (int)(Math.random() * (6 - 1 + 1) + 1);
		number2 =  (int)(Math.random() * (6 - 1 + 1) + 1);

		System.out.println(number1);
		System.out.println(number2);

		if (number1 == number2){
			answer = "True";
		}else if (number1 != number2){
			answer = "False";
		}
	}


	public String getAnswer(){
		return answer;
	}

}