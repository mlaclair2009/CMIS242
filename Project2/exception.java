package Project2;
/**
 * exception.java is an
 * exception class for catching exceptions 
 * introduced in the student class.
 * @Matt LaClair
 * @version 1.00 2014/9/19
 */

import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class exception extends JFrame{

	public static void grade() {
		JOptionPane box = new JOptionPane("Error");
		JDialog dialog = box.createDialog("Error");
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
		try {
		for (int i = 0; i < student.grades.length; i++){
			String newgradestr = JOptionPane.showInputDialog("Enter New Grade (1-100): ");
			int newgradeint = Integer.parseInt(newgradestr);
				if ((newgradeint < 0) || (newgradeint > 100)){
					throw new IllegalArgumentException("Number must be between 1-100");
				}
		}student.update();
		}catch
		(IllegalArgumentException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(box,"The number you entered was not valid:\n" + e.getMessage() + '\n' + Thread.currentThread().getStackTrace() +
					"\nPlease start over again. Thank you.", "Error", JOptionPane.ERROR_MESSAGE);
		 }
	}
}
	