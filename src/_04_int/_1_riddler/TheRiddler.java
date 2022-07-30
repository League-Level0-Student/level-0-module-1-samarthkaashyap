package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog(null, "What walks on 4 legs in the morning, 2 in the noon, 3 in the evening, and 0 in the noon?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (input.equals("human")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer was 'human'.");
	
}
		// 6. Add some more riddles
String input2 = JOptionPane.showInputDialog(null, "What month has 28 days?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (input2.equals("all of them")) {
JOptionPane.showMessageDialog(null, "Correct");
score += 1;
}
// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong, the answer was 'all of them'.");
}
String input3 = JOptionPane.showInputDialog(null, "What is tall when young, and short when old.");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (input3.equals("candle")) {
JOptionPane.showMessageDialog(null, "Correct");
score += 1;
}
// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong, the answer was 'candle'.");
}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
	}
}

