package Project1;
/**
 * Testfile.java is a test file for the 
 * file Person.java. This file
 * gathers and runs the information 
 * from Person.java.
 * 
 * @Matt LaClair
 * @version 1.00 2014/8/30
 */
public class Testfile {
	public static void main(String[] args) {
    	boolean toContinue = true;
     	
	while (toContinue) {
		char Choice = Person.Selection ();
	switch (Choice) {
			case 'P':
				Person.person1();
				Person.person2();
				Person.person3();
			break;
			
			case 'S':
				Student.student1();
				Student.student2();
			break;
			
			case 'D':
				Student.update_deg();
				break;
			case 'A':
				Person.update_add();
				break;
			case 'T':
				Teacher.teacher1();
				Teacher.teacher2();
				break;
			case 'W':
				Staff.staff1();
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
