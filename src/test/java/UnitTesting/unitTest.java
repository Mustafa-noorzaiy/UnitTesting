package UnitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class unitTest {
	TestCalculator test = new TestCalculator();
	@Test
	public void add() {
		
		int resultSum=test.testSum(2, 3);
		Assert.assertEquals(5, resultSum);
	}
	
	@Test
	public void minus() {
		int resultMinus=test.testSub(22, 15);
		Assert.assertEquals(7, resultMinus);
	}
		
	@Test
	public void multiply() {
		int resultMultiply=test.testMultiply(6,7); 
		Assert.assertEquals(42, resultMultiply);
	}
		
	@Test
	public void divide() {
		int resultDivision=test.testDivision(12, 4);
		Assert.assertEquals(3, resultDivision);
	}
		
		
		
	
	
	

	
	
}
