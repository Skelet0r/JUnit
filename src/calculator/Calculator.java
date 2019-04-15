package calculator;

public class Calculator 
{

	private int ans;
	
	public Calculator()
	{
		ans = 0;
	}
	
	// Initial add.
	public int add (int a, int b) 
	{
		ans = a + b;
		return ans;
	}
	
	// Initial subtract.
	public int sub (int a, int b) 
	{
		ans = a - b;
		return ans;
	}
	
	// Add with original and new value.
	public int add(int v)
	{
		ans += v;
		return ans;
	}
	
	// Subtract with original and new value.
	public int sub(int v)
	{
		ans -= v;
		return ans;
	}
	
	public int ans() 
	{
		return ans;
	}
}