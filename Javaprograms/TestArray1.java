/*create an array with 10size.Insert 10-1 integer numbers into it (using a for loop).
print out its value to the console using the length variable (in another for loop)
and (for-each loop).*/
public class TestArray1{
	public static void main(String[]args){
		int [] arr = {10,20,30};//new int[10];
		System.out.println("length = "+arr.length);
		//for (int i = 0;i<arr.length;i++)
			//System.out.println("int at pos "+i+" = "+arr[i]);
		for (int x : arr)
			System.out.println(x);
		String [] sa = {"one","two","three"};//new String[3];
		//sa[0] ="ond";
		//sa[1] = "yerad";
		//sa[2] = "moor";
		for(String s :sa)
			System.out.println(s);
	}
}

		
			
	

