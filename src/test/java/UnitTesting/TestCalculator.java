package UnitTesting;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {
	@BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }
    
	@Test
	public int testSum(int a, int b) {
		return a+b;
	}
	@Test
	public int testSub(int a, int b) {
		return a-b;
	}
	
	@Test
	public int testMultiply(int a, int b) {
		return a*b;
	}
	
	@Test
	public int testDivision(int a, int b) {
		if(b==0) {
			throw new IllegalArgumentException("Number can not be divied by zero");
		}
	return a/b;
		
		}
	
	
}
