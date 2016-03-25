package Project3;
/**
 * project3.java is a source file for the recursive method
 * divide(). This method will call itself repeatedly, counting up from 2 replacing
 * the divisor, until the input from the user is met.
 * The method will then calculate the sum of all the fractions.
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.*;

import java.awt.*;


public class project3 extends JFrame {
	
	   public static void main(String[] args) {
	   
		   Scanner input = new Scanner (System.in);
		   
		   //Create Dialog Box that will Always be on Top
		   JOptionPane box = new JOptionPane("Welcome to project3.java");
		   JDialog dialog = box.createDialog("Welcome!");
		   dialog.setAlwaysOnTop(true);
		   dialog.setVisible(true);
		   
		   //Take Input from User
		   String n_str = JOptionPane.showInputDialog("Enter Divisor (2 or greater): ");
		   int new_n = Integer.parseInt(n_str);
				while ((new_n < 2)){
					n_str = JOptionPane.showInputDialog("Enter Divisor (2 or greater): ");
					new_n = Integer.parseInt(n_str);
				}
			//Set Variables & Call Recursive Method
			int count = 2;
			double sum = 1;
			System.out.print((int)Math.round(sum) + " + ");
			divide(box,new_n, count, sum);
			
	   }

public static void divide(JOptionPane box,int n, double a, double sum){
	
	//If count is less than or equal to input
	if (a <= n ){
		//Fractions are created/displayed
		System.out.print("\n1/" + (int)Math.round(a) + " + ");
		sum = (sum +(1/a));
		a++;
		//Divide() calls itself repeatedly
		divide(box,n,a,sum);
		
		}else{
		//Solution is displayed	
		System.out.print("\n....0.....");
		System.out.print("\n....calculating.....");
		System.out.print("\n....see popup!");
		JOptionPane.showMessageDialog(box,"\nThe Solution is: " + String.format("%3.2f",sum), "Solution", JOptionPane.INFORMATION_MESSAGE);
		}
}
}


	   
	   






