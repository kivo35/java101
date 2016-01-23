/**
 * 
 */
package com.sqa.kv.basic;

import java.util.Scanner;

/**
 * @author Kirill
 * 
 */
public class MyGrade
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String input;
		int score = 0;
		Scanner scanner = new Scanner(System.in);

		while (true)
		{
			System.out.print("Enter the grade value 0-100, \"quit\" to exit: ");
			input = scanner.nextLine();

			if (input.equalsIgnoreCase("quit"))
			{
				System.out.println("Good bye!");
				break;
			}

			try
			{
				score = Integer.parseInt(input);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid input. Try again!");
			}

			if (score >= 90 && score <= 100)
			{
				System.out.println("Your grade is \'A\'. Great job!");
			}
			else if (score >= 80 && score <= 89)
			{
				System.out.println("Your grade is \'B\'. Good!");
			}
			else if (score >= 70 && score <= 79)
			{
				System.out.println("Your grade is \'C\'. Not bad!");
			}
			else if (score >= 60 && score <= 69)
			{
				System.out.println("Your grade is \'D\'. Try better next time!");
			}
			else if (score < 60)
			{
				System.out.println("Your grade is \'F\'. Study harder next time!");
			}
		}
	}
}
