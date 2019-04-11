package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("how many nickles do you have");
		String d = JOptionPane.showInputDialog("how many dimes do you have");
		String q = JOptionPane.showInputDialog("how many quarters do you have");
		int nickles = Integer.parseInt(n);
		int dimes = Integer.parseInt(d);
		int quarters = Integer.parseInt(q);
		
		double money = nickles * 0.05 + dimes * 0.1 + quarters * 0.25; 
		// Ask the user how many nickels they have
		JOptionPane.showMessageDialog(null, money);
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

