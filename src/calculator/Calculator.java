package calculator;

public class Calculator 
{

	public static int add (int a, int b) 
	{
		return a + b;
	}
	
	public static int sub (int a, int b) 
	{
		return a - b;
	}
	
	public static void main (String args[]) 
	{
		int a = 3, b = 2;
        int res = add (a, b);
        System.out.println("3 + 2 = " + res);
	}
}