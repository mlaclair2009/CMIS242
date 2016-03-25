package Project1;

import java.util.Scanner;
/**
 * Person.java is a resource file for the 
 * file Testfile.java. This file
 * provides information for the test
 * program.
 * 
 * @Matt LaClair
 * @version 1.00 2014/8/30
 */
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
			"A - Update Address\n" +
			"D - Update Degree path\n" +
			"P - Personnel Information\n" + 
			"S - Student Information\n" + 
			"T - Teacher Information\n" +
			"W - Staff Information\n" +
			"Q - Quit\n");

		choice = (input.nextLine()).charAt (0);
		choice = Character.toUpperCase (choice);
		
		if (choice != 'P' && choice != 'S' && choice != 'T' && choice != 'A' && choice != 'W' && choice != 'Q' && choice != 'D'){
			System.out.println ("An invalid action.\n" + 
				"Please enter one of A, D, P, S, T, W, or Q.\n");
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
		
		Person person1 = new Person ();
		public static void person1 (){
			System.out.print("\nPerson 1's information is as follows:");
			System.out.print (
				"\nName: " + name + "\n" + 
				"DOB: " + DOB + " \n" + 
				"Address: " + addy + "\n" +
				"SSN: " + SSN );
		}
		Person person2 = new Person ();
		public static void person2 (){
			SSN = "N/A";
			DOB = "N/A";
			name = "N/A";
			addy = "N/A";
			System.out.print("\n");
			System.out.print("\nPerson 2's information is as follows:");
			System.out.print (
				"\nName: " + name + "\n" + 
				"DOB: " + DOB + " \n" + 
				"Address: " + addy + "\n" +
				"SSN: " + SSN );
		}
		Person person3 = new Person ();
		public static void person3 (){
			SSN = "987-65-4321";
			DOB = "N/A";
			name = "N/A";
			addy = "N/A";
			System.out.print("\n");
			System.out.print("\nPerson 3's information is as follows:");
			System.out.print (
			"\nName: " + name + "\n" + 
			"DOB: " + DOB + " \n" + 
			"Address: " + addy + "\n" +
			"SSN: " + SSN );
		}
	 	Person update_add = new Person ();
	 	public static void update_add (){
	 		Scanner input = new Scanner (System.in);
	 		System.out.print ("Please enter new address: ");
	 		addy = (input.nextLine());
	 		System.out.print ("The new address is: " + addy);
	 		
	 	}
	 		
}
class Student extends Person {
	static String univ = "University of Maryland";
	static String study = "Computer Science";
	static String UG = "Undergraduate";
	
	Student update_deg = new Student ();
	public static void update_deg () {
		Scanner input = new Scanner (System.in);
 		System.out.print ("Please enter new Degree path (Undergraduate/Graduate): ");
 		UG = (input.nextLine());
 		System.out.print ("The new Degree Path is: " + UG);
	}
	Student student1 = new Student ();
	public static void student1 (){
		SSN = "N/A";
		DOB = "N/A";
		name = "N/A";
		addy = "N/A";
		univ = "N/A";
		study = "N/A";
		UG = "N/A";
		System.out.print("\nStudent 1's information is as follows:");
		System.out.print (
			"\nName: " + name + "\n" + 
			"DOB: " + DOB + " \n" + 
			"Address: " + addy + "\n" +
			"SSN: " + SSN + "\n" +
			"University: " + univ + "\n" +
			"Study: " + study + "\n" +
			"Degree Path: " + UG);
	}
	Student student2 = new Student ();
	public static void student2 (){
		SSN = "568-78-9876";
		DOB = "December 1st 1984";
		name = "Jody Gallagher";
		addy = "345 Whipper Snapper Road";
		System.out.print("\n");
		System.out.print("\nStudent 2's information is as follows:");
		System.out.print (
			"\nName: " + name + "\n" + 
			"DOB: " + DOB + " \n" + 
			"Address: " + addy + "\n" +
			"SSN: " + SSN + "\n" +
			"University: " + univ + "\n" +
			"Study: " + study + "\n" +
			"Degree Path: " + UG);

	}
}
class Teacher extends Person {
	static String univ = "University of Maryland";
	static String dep = "Computer Science";
	
	Teacher teacher1 = new Teacher ();
	public static void teacher1 (){
		SSN = "675-57-9823";
		DOB = "January 19th 1980";
		name = "Naomi Rose";
		addy = "98 Wowsa St.";
		System.out.print("\nTeacher 1's information is as follows:");
		System.out.print (
			"\nName: " + name + "\n" + 
			"DOB: " + DOB + " \n" + 
			"Address: " + addy + "\n" +
			"SSN: " + SSN + "\n" +
			"University: " + univ + "\n" +
			"Department: " + dep);
	}
	Teacher teacher2 = new Teacher ();
	public static void teacher2 (){
		SSN = "N/A";
		DOB = "N/A";
		name = "N/A";
		addy = "N/A";
		univ = "N/A";
		dep = "N/A";
		System.out.print("\n");
		System.out.print("\nTeacher 2's information is as follows:");
		System.out.print (
			"\nName: " + name + "\n" + 
			"DOB: " + DOB + " \n" + 
			"Address: " + addy + "\n" +
			"SSN: " + SSN + "\n" +
			"University: " + univ + "\n" +
			"Department: " + dep);
	}
}
class Staff extends Teacher {
	Staff staff1 = new Staff ();
	public static void staff1 (){
		System.out.print ("\nStaff member 1 is from the " + dep + " department." );
	}
}
		
		
