package GameZone;

import javax.swing.JOptionPane;

public class gameZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Pick a number 1 - 10");
		
		JOptionPane.showMessageDialog(null,
				"The number is " + (1+(int)(Math.random() * 10)));
		
	}

}
