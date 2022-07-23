package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String Bob = "Amazing Worker";
	String Justin = "Cracked at Fortnite";
	String Garry = "Ace Student";

		// 2. Ask the user to enter a name. Store their answer in a variable.
	String input = JOptionPane.showInputDialog(null, "What's your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (input.equals("Bob")) {
		JOptionPane.showMessageDialog(null, Bob);
	}
	if (input.equals("Justin")) {
		JOptionPane.showMessageDialog(null, Justin);
	}
	if (input.equals("Garry")) {
		JOptionPane.showMessageDialog(null, Garry);
	}

	}
}

