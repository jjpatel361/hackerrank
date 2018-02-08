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
public class JewelsAndStonesTest {

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
	 * Test method for {@link leetcode.JewelsAndStones#numJewelsInStones(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testNumJewelsInStones_Basic1_ShouldPass() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int jewel_count = JewelsAndStones.numJewelsInStones(jewels, stones);
		Assert.assertEquals(3, jewel_count);
	}
	
	@Test
	public void testNumJewelsInStones_BasicFailCase_ShouldFail() {
		String jewels = "z";
		String stones = "ZZ";
		int jewel_count = JewelsAndStones.numJewelsInStones(jewels, stones);
		Assert.assertEquals(0, jewel_count);
	}

}
