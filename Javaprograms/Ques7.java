//print non multiples of 3 between 1 to 100 to the moniter!

public class Ques7
{
	public static void main(String[]args)
	{
		System.out.println("print non multiples of 3 between 1 to 100");
		
		for(int i=1;i<=100;i++)
		{
			if(i%3!=0)
			{
				System.out.println(i);
			}
		}
	}
}
