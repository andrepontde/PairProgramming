import javax.swing.JOptionPane;

public class WeeklyPayApp{
	public static void main(String args[]){
		int hours;
		double rate;

		WeeklyPay myPay = new WeeklyPay();

		hours = Integer.parseInt(JOptionPane.showInputDialog(null,"hours"));
		rate = Double.parseDouble(JOptionPane.showInputDialog(null,"rate"));

		myPay.setHours(hours);
		myPay.setRate(rate);
		myPay.calculateRate();

		JOptionPane.showMessageDialog(null, "the total is: " + myPay.getTotal());
	}
}