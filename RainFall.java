public class RainFall{
	private int min, total;
	private int rainfall[][] = new int[2][7];

	public void setRainFall(int rainfall[][]){
		this.rainfall = rainfall;
	}

	public void compute(){
		min = rainfall[0][0];

		for (int row = 0; row<2; row++){
			for(int colu = 0; colu < 7; colu++){
				total = total + rainfall[row][colu];

				if (rainfall[row][colu]< min){
					min = rainfall[row][colu];
				}
			}
		}

	}


	public int getTotal(){

		return total;
	}

	public int getMin(){
		return min;
	}
}