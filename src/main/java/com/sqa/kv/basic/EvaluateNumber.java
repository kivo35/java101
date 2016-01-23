/**
 * 
 */
package com.sqa.kv.basic;

import java.util.Scanner;

/**
 * @author Kirill
 * 
 */
public class EvaluateNumber
{
	public static void evaluate(String n)
	{
		int convert;
		convert = Integer.parseInt(n);

		if (convert > 10)
		{
			System.out.println("The number " + convert + " is greater than 10!");
		}
		else
		{
			System.out.println("The number " + convert + " is smaller than 10!");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String num;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter any number: ");
		num = scanner.nextLine();
		evaluate(num);
	}
}
