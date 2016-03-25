package Homework3;

import java.util.Scanner;

import Project2.Exception;
import Project2.Student;

public class exception_handling {
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
}
