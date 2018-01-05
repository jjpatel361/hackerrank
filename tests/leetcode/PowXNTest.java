/**
 * 
 */
package leetcode;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.*;

/**
 * @author Jay Patel
 *
 */
public class PowXNTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link leetcode.PowXN#myPow(double, int)}.
	 */
	@Test
	public void testMyPow_OddExponent() {
		double actual = PowXN.myPow(2, 3);
		Assert.assertEquals(8, actual, 0.001);
	}
	
	@Test
	public void testMyPow_EvenExponent() {
		double actual = PowXN.myPow(2, 4);
		Assert.assertEquals(16, actual, 0.001);
	}
	
	@Test
	public void testMyPow_NegativePowers_ShouldPass() {
		double actual = PowXN.myPow(34.00515, -3);
		Assert.assertEquals(0.0000254311451, actual, 0.001);
	}
	
	@Test
	public void testMyPow_LargePowerWithBase1_ShouldPass() {
		double actual = PowXN.myPow(1, -2147483648);
		Assert.assertEquals(1, actual, 0.001);
	}

}
