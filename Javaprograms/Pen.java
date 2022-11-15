public class Pen
{
	int inkQty;
	String color;
	
	public void write (String data)
	{
		if (inkQty> 0)
		{
			System.out.println("pen writting "+data+"in "+color+" color)"
			inkQty--;
		}
		else
			System.out.println("yakappa, first fill the ink and then write maadi...");
	}
	public vooid refill (int Qty)
	{
		inkQty = inkQty + qty;
	}
}

	
		
		
	
		
	
	
	
