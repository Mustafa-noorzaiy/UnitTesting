package UnitTesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class unitTest {

	@Test
	public void test() {
		TestCalculator test = new TestCalculator();
		
		int resultSum=test.testSum(2, 3);
		assertEquals(5, resultSum);
		
		int resultMinus=test.testSub(22, 15);
		assertEquals(7, resultMinus);
		
		int resultMultiply=test.testMultiply(6,7); 
			assertEquals(42, resultMultiply);
		
		int resultDivision=test.testDivision(12, 4);
			assertEquals(3, resultDivision);
		
	}
	
	
	
	
	
}
