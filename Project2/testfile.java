package Project2;

/**
 * testfile.java is a test file for the 
 * file student.java. This file
 * gathers and runs the information 
 * from student.java.
 * 
 * @Matt LaClair
 * @version 1.00 2014/9/19
 */
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


public class testfile extends JFrame {
	
		public static void main(String[] args) {
			boolean toContinue = true;
			Scanner input = new Scanner (System.in);
			
			JOptionPane box = new JOptionPane("Welcome to testfile.java");
			JDialog dialog = box.createDialog("Welcome!");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);
			
		while (toContinue) {
			char Choice = student.Selection ();
		switch (Choice) {
		
				case 'I':
					JOptionPane.showMessageDialog(box,"Name: " + student.name +"\nDOB: " + student.DOB + " \n" + "Address: " + student.addy + "\n" +
							"SSN: " + student.SSN ,"Student's Personal Information", JOptionPane.INFORMATION_MESSAGE);
				break;
					
				case 'D':
					JOptionPane.showMessageDialog(box,"\nUniversity: " + student.univ + "\n" + "Study: " + student.study + "\n" +
							"Degree Path: " + student.UG,"Student's Degree Information", JOptionPane.INFORMATION_MESSAGE);
				break;
				
				case 'G':		
					JOptionPane.showMessageDialog(box,"Grades: " + student.grades[0] + "   " + student.grades[1] + "   " + student.grades[2] 
					,"Student's Grades", JOptionPane.INFORMATION_MESSAGE);
					
					int answer_1 = JOptionPane.showConfirmDialog(box,"Would you like to update these grades?");
					if(answer_1 == JOptionPane.YES_OPTION){
						student.update();
						}
					JOptionPane.showMessageDialog(box,"Updated Grades: " + student.grades[0] + "   " + student.grades[1] + "   " + student.grades[2] 
					+ "\nAverage: " + student.average(),"Student's Grades", JOptionPane.INFORMATION_MESSAGE);
									
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

