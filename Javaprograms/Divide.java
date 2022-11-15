import java.util.Scanner;

public class Divide
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner ( System.in);
		System.out.println("Input the first number: ");
		int a = input.nextInt();
		System.out.println("Input the second number: ");
		int b = input.nextInt();
		int d = (a/b);
		System.out.println();
		System.out.println("The divition of a and b is: " +d);
		
		System.out.println(2>>1);
		System.out.println(6>>2);
		System.out.println(-2>>1);
		
		System.out.println(10);
		System.out.println(012);
		System.out.println(0xAB);
		
		System.out.println(2<<1);
		System.out.println(6<<2);
		System.out.println(-2<<1);
		
		int x = 12;
		System.out.println(~x);
		
		int j = 200;
		System.out.println(~j);
		
		int m = 10;
		int n = 6;
		System.out.println(m^n);
		
		int k = 20;
		System.out.println(k>>>2);
		
		int l = -20;
		System.out.println(l>>>2);
		
		System.out.println(4|3);
		System.out.println(4|4);
		System.out.println(4&3);
		System.out.println(4/3);
		
		int g = 50;
		
		while(g !=0)
		{
			System.out.println(g>>>=1);
		}
		
		
		
		
	}
}

		

