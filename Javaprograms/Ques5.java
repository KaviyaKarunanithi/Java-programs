//print all odd numbers from 1 to 100 to the moniter!
public class Ques5
{
	public static void main(String[]args)
	{
		System.out.println("print odd numbers between 1 to 100");
		
		for (int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
