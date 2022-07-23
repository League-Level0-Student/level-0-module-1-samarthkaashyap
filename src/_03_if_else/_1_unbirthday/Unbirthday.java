package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog(null, "When is your birthday? Enter in mm/dd format.");
	if (input.equals("07/22")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
			JOptionPane.showMessageDialog(null, "Merry UnBirthday");
		
	}
}
	public Unbirthday() {
		// TODO Auto-generated constructor stub
	}

}
