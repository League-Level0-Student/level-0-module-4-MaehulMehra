package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog(null, "What day of the week is it?");
		// Set the boolean isWeekend based on the value they enter
		if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			isWeekend = true;
		}
		else {
			isWeekend = false;
		}
		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend) {
			JOptionPane.showMessageDialog(null, "You get to sleep in");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String exam = JOptionPane.showInputDialog(null, "What did you get on your last exam?");
		int examInt = Integer.parseInt(exam);
		// If they scored more than 70, they passed the exam.
		if (examInt > 70) {
			passedExam = true;
		}
		else {
			passedExam = false;
		}
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		if (passedExam) {
			JOptionPane.showMessageDialog(null, "Congratulations");
		}
		else {
			JOptionPane.showMessageDialog(null, "Better luck next time");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		if (gameIsOver) {
			JOptionPane.showMessageDialog(null, "Game is over");
		}
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog(null, "What color do you want to draw with?");
		if (color.equalsIgnoreCase ("red")) {
			isRed = true;
		}
		else {
			isRed = false;
		}
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog(null,"What shape do you want to draw?");
		if (shape.equalsIgnoreCase ("square")) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		if (isRed && isSquare) {
			drawRedSquare ();
		}
		else {
			JOptionPane.showMessageDialog(null, "I do not know how to draw this shape");
		}
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.penDown(); 
		rob.setPenColor (250, 0, 0);
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
		
		
		// Complete the rest of this method
	}	
}
