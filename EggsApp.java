import javax.swing.JOptionPane;
public class EggsApp{

	public static void main (String args []){
		int eggs;

		Eggs myEggs = new Eggs();
		eggs = Integer.parseInt( JOptionPane.showInputDialog(null, "How many eggs have you colleted :"));
		myEggs.setEggs(eggs);
		myEggs.calcDozen();

		JOptionPane.showMessageDialog(null, "The total boxes of eggs you collected were : " + myEggs.getEggs());
		JOptionPane.showMessageDialog(null, "The remainder of eggs  you have leftover are : " + myEggs.getLeftOvers());


	}
}