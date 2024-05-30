public class Cinema{
	//Data members
	int age, price;
	String day;

	//set methods

	public void setAge(int age){
		this.age = age;
	}

	public void setDay(String day){
		this.day = day;
	}

	//Other methods
	public void compute(){


		if (day.equalsIgnoreCase("mon") || day.equalsIgnoreCase("tue") || day.equalsIgnoreCase("wed") || day.equalsIgnoreCase("thu")) {
		    if (age < 5 || age > 65){
				price = 0;
			}else if (age > 5 || age < 15){
				price = 15;
			}else if (age > 15 || age < 65){
				price = 20;
			}else{
				price = 1500;
			}
		}else if (day.equalsIgnoreCase("fri") || day.equalsIgnoreCase("sat") || day.equalsIgnoreCase("sun")){
		    if (age < 5 || age > 65){
				price = 5;
			}else if (age > 5 || age < 15){
				price = 20;
			}else if (age > 15 || age < 65){
				price = 30;
			}else{
				price = 1500;
			}
		}else {
			System.out.println("No funcionó");
		}

	}


	public int getPrice(){
		return price;
	}


}