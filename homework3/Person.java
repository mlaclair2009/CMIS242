package Homework3;
/**
 * Person.java is a resource file for the 
 * file homework3.java. This file
 * provides information for the test
 * program.
 * 
 * @Matt LaClair
 * @version 1.00 2014/9/11
 */
import java.util.Scanner;

public class Person {
	
	public static char Selection (){
		Scanner input = new Scanner (System.in);
		char choice = ' ';
		boolean validAction = false;
		while (! validAction) {
			
		System.out.print("\n");	
		System.out.println ("\nPlease select an option:");
		System.out.print("\n");
		System.out.print (
			"A - Person's Address\n" +
			"D - Person's Date of Birth & Age\n" +
			"N - Person's Name\n" + 
			"Q - Quit\n");

		choice = (input.nextLine()).charAt (0);
		choice = Character.toUpperCase (choice);
		
		if (choice != 'A' && choice != 'D' && choice != 'N' && choice != 'Q'){
			System.out.println ("An invalid action.\n" + 
				"Please enter one of A, D, N, or Q.\n");
		} else {
		validAction = true;
    } 
}
		return choice;
	
	}

	    static int month = 11;
	    static int day = 25;
	    static int year = 1986;
		static String name = "Billy Bob";
		static String addy = "123 Awesome Street";
		static int age = howold(month, year);
		
				
		public static int howold (int m, int y){
			int cmonth = 9;
			int agey = (2014 - year);
			if (cmonth < month){
				return (agey - 1);
			} else {
				return agey;
			}
		}
		
		
	 	}

	 		

