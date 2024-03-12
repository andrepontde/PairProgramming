//21/02/24
//pair programming

public class Average{
	 private double result1, result2, result3;

	 double Avg;

	 public void setResult(double result1, double result2, double result3){
	 		this.result1 = result1;
	 		this.result2 = result2;
	 		this.result3 = result3;
	}

	public void computeAvg(){
		Avg = (result1 + result2 + result3)/3;

	}

	public double getAvg(){
		return Avg;
	}
}