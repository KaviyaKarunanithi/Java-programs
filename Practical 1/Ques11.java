//WAP to divide any two int values and get the output of remainder and quotient.

import java.util.Scanner;

public class Ques11
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 1st number");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int y = sc.nextInt();
		int reminder =x/y;
		int quotient = x%y;
		System.out.println("Reminder is "+reminder);
		System.out.println("quotient is "+quotient);
		
		
		
		
	}
}
