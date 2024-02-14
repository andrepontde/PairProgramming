public class Eggs{

	private int eggs;
	private int dozenEggs, leftOvers;


	// set methods

	public void setEggs (int eggs){
		this.eggs = eggs;
	}

	// my methods
	public void calcDozen(){
		dozenEggs = eggs/12;
		leftOvers = eggs%12	;
	}


	// get methods
	public int getEggs(){
		return dozenEggs;
	}
	public int getLeftOvers(){
		return leftOvers;
	}
}