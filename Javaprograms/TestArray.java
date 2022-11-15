public class TestArray{
	public static void main(String[]args){
		int[]arr1 = new int[10];//to create an empty array
		int[]arr2 = {10,20,30};//to create a literal array
		
		for (int i = 0;i<arr1.length;i++)//to loop over the array
			
		System.out.println("value in "+i+"th box = "+arr1[i]);
		
		for (int val :arr2)
			System.out.println(val);
	}
}

		
	
		
