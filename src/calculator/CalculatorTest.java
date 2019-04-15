package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
	
	Calculator calc;
	
	@Before
	public void initialValues()
	{
		System.out.println("Creating Calculator object.");
		calc = new Calculator();
	}

	@Test
	public void testAdd() 
	{
		System.out.println("Test add.");
		int result = calc.add(3, 2);
		int esp = 5;
		
		assertEquals(esp, result);
	}
	
	@Test
	public void testSubs() 
	{
		System.out.println("Test sub.");
		int result = calc.sub(3, 2);
		int esp = 1;
		
		assertEquals(esp, result);
	}
}