package leetcode;
import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import leetcode.HIndex;

/**
 * 
 */

/**
 * @author Jay Patel
 *
 */
public class HIndexTest {

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
	 * Test method for {@link leetcode.HIndex#hIndex(int[])}.
	 */
	@Test
	public void testHIndex_BasicArrayTest1() {
		int[] test_citations = new int[]{3, 0, 6, 1, 5};
		int hindex_actual = HIndex.hIndex(test_citations);
		Assert.assertEquals(3, hindex_actual);
	}
	
	@Test
	public void testHIndex_BasicArrayTest2() {
		int[] test_citations = new int[]{10, 8, 5, 4, 3};
		int hindex_actual = HIndex.hIndex(test_citations);
		Assert.assertEquals(4, hindex_actual);
	}
	
	@Test
	public void testHIndex_BasicArrayTest3() {
		int[] test_citations = new int[]{25, 8, 3, 3, 3};
		int hindex_actual = HIndex.hIndex(test_citations);
		Assert.assertEquals(3, hindex_actual);
	}
	
	@Test
	public void testHIndex_BasicArrayTest4() {
		int[] test_citations = new int[]{1, 2};
		int hindex_actual = HIndex.hIndex(test_citations);
		Assert.assertEquals(1, hindex_actual);
	}
	
	@Test
	public void testHIndex_SingleNumberInArray_ShouldReturnOne() {
		int[] test_citations = new int[]{25};
		int hindex_actual = HIndex.hIndex(test_citations);
		Assert.assertEquals(1, hindex_actual);
	}
	
	@Test
	public void testHIndex_SingleNumberInArrayWithZero_ShouldReturnZero() {
		int[] test_citations = new int[]{0};
		int hindex_actual = HIndex.hIndex(test_citations);
		Assert.assertEquals(0, hindex_actual);
	}
	
}
