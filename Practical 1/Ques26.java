public class Ques26
{
	public static void x()
	{
		int c = 0;
		y();
	}
	public static void y()  // we can't access one method varible to another method
	                        // local varibles are stored in stack
	{
		int b = 20;
	}
	public static void main(String[]args)
	{
		int a = 10;
		x();
		Test2.z();   // calling z method here
	}
	
}

class Test2{
	public static void z()
	{
		System.out.println("in class Test2 and methodz()");
	}
}

		



