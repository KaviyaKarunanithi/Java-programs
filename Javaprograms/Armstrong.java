
//Armstrong number for N digit number

import java.util.Scanner;
public class Armstrong
{
	public static void main(String[]args)
	{
		System.out.println("please provide the input number:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double result = 0;
		int count = 0;
		for ( int temp=input;temp!=0;count ++)
		{
			temp = temp/10;
		}
		for (int temp = input; temp != 0; temp = temp/10)
		{
			int remainder = temp/10;
			result +=Math.Power(remainder,count);
		}
		if(input==result)
		{
			System.out.println(input+"is armstrong number");
		}
		else
		{
			System.out.println(input+"is not armstrong number");
		}
	}
	
		
		
}
