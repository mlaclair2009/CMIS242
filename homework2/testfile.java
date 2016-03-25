package homework2;
/**
 * testfile.java is a test file for the 
 * file Student.java. This file
 * gathers and runs the information 
 * from Student.java.
 * 
 * @Matt LaClair
 * @version 1.00 2014/9/04
 */
import java.util.Scanner;
public class testfile {
	
	public static void main(String[] args) {
		
    	boolean toContinue = true;
    	Scanner input = new Scanner (System.in);
    	int [] grades = new int [3];
    	grades [0] = 78;
    	grades [1] = 96;
    	grades [2] = 89;
    	
	while (toContinue) {
		char Choice = Student.Selection ();
	switch (Choice) {
			case 'P':
				Student.personal();
			break;
			
			case 'E':
				Student.education(grades);
			break;
			
			case 'U':		
				Student.addItem(grades);
				break;
			case 'Q':
				System.out.println ("\nThank you for using this program!");
				toContinue = false;
				break;
			default:
				break;
		
	}
}
	}
}
