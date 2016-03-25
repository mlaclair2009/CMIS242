import java.util.Scanner;

/**
 * MattLaclairHW1.java is a resource file for the 
 * file MattlaclairHW1test.java. This file
 * provides information for the test
 * program.
 * 
 * @Matt LaClair
 * @version 1.00 2014/8/22
 */
 
public class MattlaclairHW1 {
		
    
    public static void GetName() {
    	//display name
    	System.out.println("My Name is Matt LaClair");
    }
    
    public static void GetAge() {
    	//display age
    	System.out.println("\nI'm 27 years old");
    }
    
    public static void GetHobbies() {
    
    	//display hobbies
    	System.out.println("\nI love drumming and hanging out with my family!");
    	}
    
    public static char GetAction () {
		
		Scanner input = new Scanner (System.in);
		char choice = ' ';
		boolean validAction = false;
		
		//start while loop for menu
		while (! validAction) {
		// display the menu
		System.out.print ("\nWhat else would you like to know?");
		System.out.print("\n");
		System.out.print (
			"P - What pets I have?\n" + 
			"L - Where I live?\n" + 
			"W - What I am doing currently?\n" +
			"Q - Quit the program\n");
		
		System.out.print ("Please select an action: ");
		choice = (input.nextLine()).charAt (0);
		choice = Character.toUpperCase (choice);
		
		//error prevention
		if (choice != 'P' && choice != 'L' && choice != 'W' && choice != 'Q'){
			System.out.println ("An invalid action.\n" + 
				"Please enter one of P, L, W, or Q.\n");
		} else {
		validAction = true;
    } 
}
		return choice;
    }
}

