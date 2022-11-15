import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = reader .nextInt();
		
		if (num%2==0)
			System.out.println(num + "is even");
		else
			System.out.println(num + "is odd");
		
		int n1=56,n2=85,sum;
		sum = n1+n2;
		System.out.println("The sum of number is : "+sum);
		
	}
}

		

	