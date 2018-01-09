/**
 * 
 */
package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * @author Jay Patel
 *
 */
public class MissingNumberTest {

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
	 * Test method for {@link leetcode.MissingNumber#missingNumber(int[])}.
	 */
	@Test
	public void testMissingNumber_Basic() {
		int[] d = new int[]{3,0,1};
		int missing_number = MissingNumber.missingNumber(d);
		Assert.assertEquals(2, missing_number);
	}

}
