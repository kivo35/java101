/**
 * 
 */
package com.sqa.kv.basic;

import java.util.Scanner;

/**
 * @author Kirill
 * 
 */
public class MonthofYear
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// initialize variables to hold user input
		String input;
		int n;
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			// ask for user input
			System.out.print("Enter a number from 1-12 to see the month of the year, \"quit\" to exit: ");
			input = scanner.nextLine();

			if (input.equalsIgnoreCase("quit"))
			{
				break;
			}

			try
			{
				n = Integer.parseInt(input);
			}
			catch (NumberFormatException e)
			{
				// TODO Auto-generated catch block
				System.out.println("invalid option");
				// e.printStackTrace();
				continue;
			}

			// determine based on user input what
			// month of the year is it
			switch (n)
			{
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("Incorrect number. Try again!");
				break;
			}
		}
		System.out.println("Good Bye");
	}
}
