public class WeeklyPay{
	private int hours;
	private double rate, total;

	//set methods

	public void setHours(int hours){
		this.hours=hours;
	}
	public void setRate(double rate){
		this.rate=rate;
	}

	//Other methods
	public void calculateRate(){
		total = rate*hours;
	}

	//get methods
	public double getTotal(){
		return total;
	}
}