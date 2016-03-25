package homework2;
/**
 * Student.java is a resource file for the 
 * file testfile.java. This file
 * provides information for the test
 * program.
 * 
 * @Matt LaClair
 * @version 1.00 2014/9/04
 */
import java.util.Scanner;

public class Student {
	
	public static char Selection (){
		Scanner input = new Scanner (System.in);
		char choice = ' ';
		boolean validAction = false;
		while (! validAction) {
			
		System.out.print("\n");	
		System.out.println ("\nPlease select an option:");
		System.out.print("\n");
		System.out.print (
			"P - Student Personal Information\n" +
			"E - Student Educational Information & Grades\n" +
			"U - Update Grades\n" + 
			"Q - Quit\n");

		choice = (input.nextLine()).charAt (0);
		choice = Character.toUpperCase (choice);
		
		if (choice != 'P' && choice != 'S' && choice != 'E' && choice != 'U' && choice != 'M' && choice != 'Q'){
			System.out.println ("An invalid action.\n" + 
				"Please enter one of P, E, U, or Q.\n");
		} else {
		validAction = true;
    } 
}
		return choice;
		}

	
	static String SSN = "123-45-6789";
	static String DOB = "November 1st 1985";
	static String name = "Billy Bob";
	static String addy = "123 Awesome Street";
	static String univ = "University of Maryland";
	static String study = "Computer Science";
	static String UG = "Undergraduate";
	
	Student personal = new Student ();
	public static void personal(){
		System.out.print("\nStudent " + name + "'s personal information is as follows:");
		System.out.print (
			"\nDOB: " + DOB + " \n" + 
			"Address: " + addy + "\n" +
			"SSN: " + SSN );
	
	}

	Student education = new Student ();
	public static void education(int[] grades){
		System.out.print("\nStudent " + name + "'s educational information is as follows:");
		System.out.print (
		"\nUniversity: " + univ + "\n" +
		"Study: " + study + "\n" +
		"Degree Path: " + UG);
		System.out.print ("\n" + name + "'s grades are as follows: \n");
		for(int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");}
	}
	
public static void addItem (int[] grades) {
	Scanner input = new Scanner (System.in);
	for (int i = 0; i < grades.length; i++) {
		System.out.print("\nPlease enter new grade (0-100): ");
		int num = input.nextInt ();
		if ((num < 0) || (num > 100)){
		Exception.handling(num);
		} else {
			grades[i] = num;
			System.out.print ("\n" + name + "'s grades are as follows: \n");
			for(int b = 0; b < grades.length; b++) {
				System.out.print(grades[b] + " ");
				}
			}
		} 
}
}

class Exception extends Student {
	Exception handling = new Exception();
	public static void handling (int num){
		Scanner input = new Scanner (System.in);
		try {
		System.out.print("The number you entered was invalid.Please enter new grade (0-100): ");
		num = input.nextInt ();
		if (num < 0 || num > 100){
			System.out.print("The number you entered was invalid.Please enter new grade (0-100): ");
		}
		} catch (NumberFormatException e1){
			System.out.print (e1);
			}
		
	}
}


	



