package main;

import java.util.Scanner;

/**
 * <h1>A simple calculator which performs Addition, Subtraction, Multiplication, Division, Modulus.</h1>
 * @author Ashik
 * @version 1.0
 * @since 29-10-2018
 */

public class Calculator {
	
	/**
	 * This method is used to add two integer number.
	 * @param a this is the first parameter of add method.
	 * @param b this is the second parameter of add method.
	 * @return this returns the sum of a and b.
	 */
	public static int add(int a,int b) {
		return a+b;
	}
	
	
	/**
	 * This method is used to subtract two integer number.
	 * @param a this is the first parameter of sub method.
	 * @param b this is the second parameter of sub method.
	 * @return this returns the subtract of a and b.
	 */
	public static int sub(int a,int b) {
		return a-b;
	}
	
	
	/**
	 * This method is used to multiply two integer number.
	 * @param a this is the first parameter of mul method. 
	 * @param b this is the second parameter of mul method.
	 * @return this returns the multiplication of a and b.
	 */
	public static int mul(int a,int b) {
		return a*b;
	}
	
	
	/**
	 * This method is used to divided two integer number.
	 * @param a this is the first parameter of div method.
	 * @param b this is the second parameter of div method.
	 * @return this returns the division of a and b.
	 */
	public static int div(int a,int b) {
		return a/b;
	}
	
	
	/**
	 * This method is used to find the modulus two integer number.
	 * @param a this is the first parameter of mod method.
	 * @param b this is the second parameter of mod method.
	 * @return this returns the modulus of a and b.
	 */
	public static int mod(int a,int b) {
		return a%b;
	}
	
	

	public static void main(String[] args) {
		
		int x,y;
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("What perform you do ?");
			System.out.println("For Addtion click 1\n"
					+ "For Subtraction click 2\n"
					+"For Multiplication click 3\n"
					+"For Division click 4\n"
					+"For Modolus click 5\n"
					+"For Break click any integer key except 1,2,3,4,5");
			
			int check=in.nextInt();
			if(check>5)
				break;
			
			System.out.println("Please enter two number : ");
			x= in.nextInt();
			y= in.nextInt();
			
			if(check==1) {
				System.out.println("The result of the Addition is : " + add(x,y) + "\n");
			}
			else if(check==2) {
				System.out.println("The result of the Subtraction is : 1" + sub(x,y) + "\n");
			}
			else if(check==3) {
				System.out.println("The result of the Multiplicationtion is : " + mul(x,y) + "\n");
			}
			else if(check==4) {
				System.out.println("The result of the Division is : " + div(x,y) + "\n");
			}
			else if(check==5) {
				System.out.println("The result of the Modulus is : " + mod(x,y) + "\n");
			}
			
		}

	}

}
