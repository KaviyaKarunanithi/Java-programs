public class TestString{
	public static void main(String[]args){
		String str = "abcdefg";
		int len = str.length();
		System.out.println("length of string "+str+" = "+len);
		
		for (int i = 0;i<str.length();i++)
		{
			char c = str.charAt(i);
			System.out.println("c = " +c);
		}
		
		String s1 = "kaviya";
		char[]ch = s1.toCharArray();
		for ( int i = 0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		String s3 = s1.toLowerCase();
		System.out.println(s3);
		
		String s4 = "pqrs";
		String s5 = "srqp";
		
		System.out.println(s4==s5);
		
		String s6 = "rambooooram";
		int position = s6.indexOf("boo",7);
		
		
		

		
		
		
	
		
		
		
		
		
		
		
			
	}
}

