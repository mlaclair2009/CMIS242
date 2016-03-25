package Project2;

/**
 * student.java is a resource file for the 
 * file testfile.java. This file
 * provides information for the test
 * program.
 * 
 * @Matt LaClair
 * @version 1.00 2014/9/19
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class student {
	
	//Menu options
	public static char Selection (){
		Scanner input = new Scanner (System.in);
		char choice = ' ';
		boolean validAction = false;
		while (! validAction) {
			
		System.out.print("\n");	
		System.out.println ("\nPlease select an option:");
		System.out.print("\n");
		System.out.print (
			"I - Student Personal Information\n" +
			"D - Student Educational Information\n" +
			"G - Grades/Update Grades\n" + 
			"Q - Quit\n");

		choice = (input.nextLine()).charAt (0);
		choice = Character.toUpperCase (choice);
		
		if (choice != 'I' && choice != 'D' && choice != 'G' && choice != 'U' && choice != 'M' && choice != 'Q'){
			System.out.println ("An invalid action.\n" + 
				"Please enter one of P, E, U, or Q.\n");
		} else {
		validAction = true;
    } 
}
		return choice;
		}

//Declare all variables
static String SSN = "123-45-6789";
static String DOB = "November 1st 1985";
static String name = "Billy Bob";
static String addy = "123 Awesome Street";
static String univ = "University of Maryland";
static String study = "Computer Science";
static String UG = "Undergraduate";
static int [] grades = {0,0,0};
	
	

	
//Update student grades/verifies valid input	
public static void update () {
	Scanner input = new Scanner (System.in);
	for (int i = 0; i < grades.length; i++){
	String newgradestr = JOptionPane.showInputDialog("Enter New Grade (1-100): ");
	int newgradeint = Integer.parseInt(newgradestr);
		if ((newgradeint < 0) || (newgradeint > 100)){
			exception.grade();
		} else {
			grades[i]= newgradeint;
			
		}
			}
		} 

//Averages student grades
public static double average(){
	int sum = 0;
	for (int i = 0;i < grades.length;i++){
		sum = sum + grades[i];
		}
	double avg = (sum/grades.length);
		
	return avg;
}

}









	



