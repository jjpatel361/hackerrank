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
public class DecodeWaysTest {

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

	@Test
	public void testdecodeways_basic() {
		String teststr = "12";
		int result = DecodeWays.numDecodings(teststr);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void testdecodeways_basic2() {
		String teststr = "1234";
		int result = DecodeWays.numDecodings(teststr);
		Assert.assertEquals(6, result);
	}

}
