import javax.swing.JOptionPane;

public class GroupsApp{
	public static void main (String args[]){
		int groups, students;

		students = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of students"));
		groups = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of groups"));

		Groups myGroup = new Groups();

		myGroup.setStudents(students);
		myGroup.setGroups(groups);
		myGroup.calculateGroups();

		JOptionPane.showMessageDialog(null, "The amount of students leftover is: " + myGroup.getLeftover());
		JOptionPane.showMessageDialog(null, "The amount of groups is: " + myGroup.getGroups());

	}
}
