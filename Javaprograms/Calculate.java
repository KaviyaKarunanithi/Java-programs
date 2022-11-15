//class definition
public class Calculate
{
	//instance variable
	int a;
	int b;
	
	//constructor to instantiate
	public Calculate(int x,int y)
	{
		this.a=x;
		this.b=y;
	}
	//method to add numbers
	public int add()
	{
		int res =a+b;
		return res;
	}
	//method to subtract numbers
	public int subtract ()
	{
		int res =a-b;
		return res;
	}
	//main method 
	public static void main(String[]args)
	{
		//create object of class
		Calculate c1=new Calculate(26,10);
		
		//calling the methods of Calculate class
		System.out.println("Addition is:"+ c1.add());
		System.out.println("subtraction is :"+ c1.subtract());
	}
}

	
		
	



