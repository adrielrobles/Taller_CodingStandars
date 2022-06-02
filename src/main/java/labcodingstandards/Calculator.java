// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;


/**
 * @author Dynamite
 *
 */
public class Calculator {	
	/**
	 * Main method.
	 * @author Dynamite
	 * @param args
	 */
	//CHECKSTYLE:OFF
	public static void main(String[] args) {
	//CHECKSTYLE:ON

		Scanner reader = new Scanner(System.in);
		
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	first=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal=new Calculator();
        String result=cal.operation(first, second, operator);

        System.out.printf(result);
		reader.close();
	}
	/**
	 * Performs an operation based on the operator char.
	 * 1 => +
	 * 2 => -
	 * 3 => *
	 * 4 => /
	 * @author Dynamite
	 * @param first The first number
	 * @param second The second number
	 * @param operator Determines the operation
	 * @return String result
	 */
	private String operation(double first, double second, char operator) {
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}
}
