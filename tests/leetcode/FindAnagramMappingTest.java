/**
 * 
 */
package leetcode;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Jay Patel
 *
 */
public class FindAnagramMappingTest {

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
	 * Test method for {@link leetcode.FindAnagramMappings#anagramMappings(int[], int[])}.
	 */
	@Test
	public void testAnagramMappings() {
		int[] A = new int[]{12, 28, 46, 32, 50};
		int[] B = new int[]{50, 12, 32, 46, 28};
		int[] expected = new int[]{1, 4, 3, 2, 0};
		int[] actual = FindAnagramMappings.anagramMappings(A, B);
		Assert.assertArrayEquals(expected, actual);
	}

}
