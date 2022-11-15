public class TestCow
{
	public static void main(String[]args)
	{
		cow c1 = new cow ();
		c1.name = "rambo";
		c1.moo();
		cow c2 = c1;//new cow();
		System.out.println("nameof c2 = "+c2.name);
		c2.name = "bonnie";
		c1.moo();
		cow c3 = c2;
		c3.name = "yanni";
		System.out.println("c1.name = "+c1.name);
		System.out.println("c2.name = "+c2.name);
		System.out.println("c3.name = "+c3.name);
		c1.moo();
	}
}

		