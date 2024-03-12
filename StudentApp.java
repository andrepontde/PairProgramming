//21/02/24
//pair programming
import javax.swing.JOptionPane;
public class StudentApp{
	public static void main(String args[]){

		String name;
		int id;
		Double result1, result2, result3;

		Student myStudent = new Student();

		result1 = Double.parseDouble(JOptionPane.showInputDialog(null, "first result: " ) );
		result2 = Double.parseDouble(JOptionPane.showInputDialog(null, "second result: " ) );
		result3 = Double.parseDouble(JOptionPane.showInputDialog(null, "third result: " ) );

		myStudent.setId(12345678);
		myStudent.setName("QWERTY");

		Average myAvg = new Average();


		myAvg.setResult(result1, result2, result3);

		myAvg.computeAvg();

		JOptionPane.showMessageDialog(null, "your result " + myAvg.getAvg());






	}
}
