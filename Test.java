/* Create a class Test. Create a method named process that accepts int as a parameter.
Create a main method.Create a int variable x with value 10.print the value of x to 
moniter using SOP.Then invoke process() and pass x as a parameter.print the value in 
process().Are you understanding the control flow? Are you understanding how parameters
are being passed?*/

public class Test
{
	 static int x = 10;
	public static void process(int number)
	{
		System.out.println(number);
		x=20;
		
	}
	
	public static void main(String[]args)
	{
		System.out.println(x);
		process(x);
		System.out.println(x);
	}
	
		
		
}

	

