public class TestPen
{
	public static void main(String[]args)
	{
		pen p1 = new pen ();
		p1.color = "black";
		System.out.println("inkQty in p1 = "+p1.inkQty);
		p1.refill(2);
		System.out.println("inkQty in p1 = "+p1.inkQty);
		p1.write ("hohohahahahahahoho");
		System.out.println("inkQty in p1 = "+p1.inkQty);
		p1.write ("omg!tomo is bandh!hurray!");
		System.out.println("inkQty in p1 = "+p1.inkQty);
		p1.write("what to write only i dont know...");
	}
}

		
