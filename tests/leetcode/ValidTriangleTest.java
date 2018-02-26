/**
 * 
 */
package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Jay Patel
 *
 */
public class ValidTriangleTest {

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
	 * Test method for {@link leetcode.ValidTriangleNumber#triangleNumber(int[])}.
	 */
	@Test
	public void testTriangleNumber() {
		int[] data = new int[]{2, 2, 3, 4};
		int count = ValidTriangleNumber.triangleNumber(data);
		assertEquals(3, count);
	}
	
	
	@Test
	public void testTriangleNumber2() {
		int[] data = new int[]{2, 2, 2, 2};
		int count = ValidTriangleNumber.triangleNumber(data);
		assertEquals(4, count);
	}

}
