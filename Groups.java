public class Groups{
	private int students, groups, leftover, numberGroups;

	//Seters
	public void setStudents(int students){
		this.students = students;
	}

	public void setGroups(int groups){
		this.groups = groups;
	}

	//Other methods
	public void calculateGroups(){
		numberGroups = students/groups;
		leftover = students%groups;
	}

	//geters
	public int getGroups(){
		return numberGroups;
	}
		//geters
	public int getLeftover(){
		return leftover;
	}
}