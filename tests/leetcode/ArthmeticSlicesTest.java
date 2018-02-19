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
public class ArthmeticSlicesTest {

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
	 * Test method for {@link leetcode.ArthmeticSlices#numberOfArithmeticSlices(int[])}.
	 */
	@Test
	public void testNumberOfArithmeticSlices() {
		int[] data = new int[]{1,2,3,4};
		int slice_count = ArthmeticSlices.numberOfArithmeticSlices(data);
		assertEquals(3, slice_count);
	}
	
	/**
	 * Test method for {@link leetcode.ArthmeticSlices#numberOfArithmeticSlices(int[])}.
	 */
	@Test
	public void testNumberOfArithmeticSlices_NonUniqueNumber_ShouldReturnOneLessThanArrayLength() {
		int[] data = new int[]{1,2,3,4,5,6};
		int slice_count = ArthmeticSlices.numberOfArithmeticSlices(data);
		assertEquals(10, slice_count);
	}

}
