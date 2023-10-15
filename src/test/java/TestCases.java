package ms.kenchen.Calculator;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestCases {

		
	@Test	
	public void testAdd() {
		
		CalculatorService c = new CalculatorService();		

		int actual = c.Add(5, 3).getResult();		
		int expected = 8; 
		
		assertEquals(expected, actual);


		
	}
	
	@Test	
	public void testSub() {
		
		CalculatorService c = new CalculatorService();		

		int actual = c.Sub(5, 3).getResult();		
		int expected = 2; 
		
		assertEquals(expected, actual);


		
	}
	
	@Test	
	public void testMul() {
		
		CalculatorService c = new CalculatorService();		

		int actual = c.Mul(5, 3).getResult();		
		int expected = 15; 
		
		assertEquals(expected, actual);


		
	}
	
	@Test	
	public void testDiv() {
		
		CalculatorService c = new CalculatorService();		

		int actual = c.Div(4, 2).getResult();		
		int expected = 2; 
		
		assertEquals(expected, actual);


		
	}

}
