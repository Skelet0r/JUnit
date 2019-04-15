package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{

	@Test
	public void testAdd() 
	{
		int rest = Calculator.add(2, 3);
		int espe = 5; // 2 + 3 = 5.
		
		assertEquals(espe, rest);
	}
	
	@Test
	public void testSub() 
	{
		int rest = Calculator.sub(3, 2);
		int espe = 1; // 3 - 2 = 1.
		
		assertEquals(espe, rest);
	}
}