public class TestPrime
{
	public static String isPrime(int num)
	{
		//perform failure case check
		if(num<0)
			return "invalid";
		//do single case check
		if(num==0||num==1)
			return "no";
		if(num==2||num==3||num==5||num==7)
			return "yes";
		//apply business logic
		for(int i=3;i<num/2;i+=2)
		{
			if(num%i==0)
				return "no";
		}
		return "yes";
	}
	
	
	
	public static void main(String[]args)
	{
		//Execute our test casses
		
		int num;
		String result;
		
		num=0;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=1;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=2;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=3;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=5;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=7;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=10;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=100;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=-1>>>1;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=-3;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
		
		num=675;
		result=TestPrime.isPrime(num);
		System.out.println("is "+num+" Prime ? = "+result);
	}
}

	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	