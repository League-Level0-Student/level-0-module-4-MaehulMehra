package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String testScore = JOptionPane.showInputDialog(null, "What did you get on you test?");
		double testScoreInt = Double.parseDouble(testScore);
		if (testScoreInt >= 90) {
			JOptionPane.showMessageDialog(null,"Good job you got an A!");
		}
		else if (testScoreInt >= 70) {
			JOptionPane.showMessageDialog(null, "Well at least you got a passing grade.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Where were you during class?");
		}
	}
}
