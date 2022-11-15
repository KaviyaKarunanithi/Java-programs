//Java program to find factorial of given number

import java.util.Scanner;

 public class Fact1{
	 public static int Factorial(int input)
	 {
		 if (input == 0 || input == 1)
		 {
			 return 1;
		 }
		 else
		 {
			 return input*Factorial(input-1);
			 
		 }
	 }
	 public static void main(String[]args)
	 {
		 System.out.println("please provide input number:");
		 
		 Scanner sc = new Scanner(System.in);
		 int input = sc.nextInt();
		 if (input < 0)
		 {
			 System.out.println("invalid number");
		 }
		 else
		 {
			 int result=Factorial(input);
			 System.out.println(input+"!="+result);
		 }
	 }
 }
 
 
		 
	 
	 
	



	
	