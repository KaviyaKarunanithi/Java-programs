import java.util.Scanner;
public class CalculatorUsingIf
{
	public static void main(String[]args)
	{
		double num1,num2,result;
		System.out.println("Calculator Using If Statement.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = sc.nextDouble();
		System.out.println("Enter second number:");
		num2 = sc.nextDouble();
		System.out.println("Enter operator (+, -, *, %):");
		char operator = sc.next().charAt(0);
		sc.close();
		
		if(operator == '+')
		{
			result = num1 + num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
		}
        else if(operator=='-')
		{
			result = num1 - num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
		}
		else if(operator =='*')
		{
			result = num1 * num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
		}
		else if(operator =='/')
		{
			result = num1 / num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
		}
	    else if(operator =='%')
		{
			result = num1 % num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
		}
		else 
		{
			System.out.println("you have entered wronng operator.");
			
		}
	}
}

			
		
			