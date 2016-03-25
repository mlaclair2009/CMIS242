package Homework3;
/**
 * homework3.java is a test file for the 
 * file Person.java. This file
 * gathers and runs the information 
 * from Person.java.
 * 
 * @Matt LaClair
 * @version 1.00 2014/9/11
 */

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class homework3 extends JFrame {
	
	public static void main(String[] args) {
		boolean toContinue = true;
		Scanner input = new Scanner (System.in);
		
		JOptionPane box = new JOptionPane("Welcome to homework3.java");
		JDialog dialog = box.createDialog("Welcome!");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		
	while (toContinue) {
		char Choice = Person.Selection ();
	switch (Choice) {
	
			case 'A':
				JOptionPane.showMessageDialog(box,Person.addy,"Person's Address", JOptionPane.INFORMATION_MESSAGE);
			break;
				
			case 'D':
				JOptionPane.showMessageDialog(box,Person.month + "/" + Person.day + "/" + Person.year + "\nAge: " + Person.age
						,"Person's DOB & Age", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			case 'N':		
				JOptionPane.showMessageDialog(box,Person.name,"Person's Name", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			case 'Q':
				JOptionPane.showMessageDialog(box,"Thank you for using this program!","THANKS!", JOptionPane.WARNING_MESSAGE);
				toContinue = false;
			break;
				
			default:
				break;
		
	}
}
	}
}
