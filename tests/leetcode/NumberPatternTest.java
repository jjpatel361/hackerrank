/**
 * 
 */
package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Jay Patel
 *
 */
public class NumberPatternTest {

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
	 * Test method for {@link leetcode.NumberPattern#find132pattern(int[])}.
	 */
	@Test
	public void testFind132pattern() {
		int[] data = new int[]{3, 1, 4, 2};
		boolean result = NumberPattern.find132pattern(data);
		assertTrue(result);
	}
	
	@Test
	public void testFind132pattern_WithNegativeValues() {
		int[] data = new int[]{1,0,1, -4, -3};
		boolean result = NumberPattern.find132pattern(data);
		assertFalse(result);
	}
	
	@Test
	public void testFind132pattern2() {
		int[] data = new int[]{3,5,0,3,4};
		boolean result = NumberPattern.find132pattern(data);
		assertTrue(result);
	}

}
