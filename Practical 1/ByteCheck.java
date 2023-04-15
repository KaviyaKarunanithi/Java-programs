/*e. Create  byte variable in main(),

byte b= 100;
try to assign 128 to a byte. Are you able to compile?What about -128?Try to
compile and run.

f.Create a byte variable,assign it a value and then store in an int variable.
byte b= 50;
int x = b;//why does this works?
b = x; //why does this not work?

g.Replace last statement with b = (byte)x;and see if it works.Now test the 
same by assigning a value to a short,a char and try to assign to an int,long,float,
double. Also from the bigger datatype variables,put the value to samaller data typed
variables.Do not create 2 variables with the same identifier*/
public class ByteCheck
{
	public static void main(String[]args)
	{
		//byte b = 100;   // we can assign
		//byte c = 128;   // we can't assign bcz max range of byte is 127
		byte d = 127;   // it works
		byte f = -128;     //-128 is in the range og byte
		
		byte b = 50; // we can assign
		int x = b;  // implicit casting
		//b = x;  // we have to do explicit casting as shown below
		b =(byte)x;
		
		
		
	}
}

		
		
		
 

