import javax.swing.JOptionPane;


public class CalculatorApp{
	public static void main(String args[]){

		double x,y;

		x = Double.parseDouble( JOptionPane.showInputDialog(null, "First number") );
		y = Double.parseDouble( JOptionPane.showInputDialog(null, "Second number") );

		Calculator myCalc = new Calculator();

		myCalc.setNum1(x);
		myCalc.setNum2(y);
		myCalc.computeSum();
		myCalc.computeSubs();

		JOptionPane.showMessageDialog(null, "sum: " + myCalc.getSum());
		JOptionPane.showMessageDialog(null, "Subtraction: " + myCalc.getSubs());

		Converter myConv = new Converter();

		myConv.setCm(Double.parseDouble(JOptionPane.showInputDialog(null, "Centimetres")));
		myConv.compute();
		JOptionPane.showMessageDialog(null, "Cm to In; " + myConv.getIn());


		myConv.setIn(Double.parseDouble(JOptionPane.showInputDialog(null, "Inches")));
		myConv.computeIntoCm();
		JOptionPane.showMessageDialog(null, "In to Cm; " + myConv.getCm());


		myConv.setCel(Double.parseDouble(JOptionPane.showInputDialog(null, "Celcius ")));
		myConv.computeCelToFar();
		JOptionPane.showMessageDialog(null, "Cel to far; " + myConv.getFar());


		myConv.setFarhen(Double.parseDouble(JOptionPane.showInputDialog(null, "Fahren ")));
		myConv.computeFarToCel();
		JOptionPane.showMessageDialog(null, "Far to Cel; " + myConv.getCel());






	}
}