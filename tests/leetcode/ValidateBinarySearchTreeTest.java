/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Jay Patel
 *
 */
public class ValidateBinarySearchTreeTest {

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
	public void test_SortedArray_ShouldBeTrue() {
		List<Integer> data = Arrays.asList(1,2,3,4,5,6,7);
		boolean result = ValidateBinarySearchTree.isSorted(data);
		Assert.assertTrue(result);
	}
	
	@Test
	public void test_UnSortedArray_ShouldBeFalse() {
		List<Integer> data = Arrays.asList(1,2,4,6,5,7);
		boolean result = ValidateBinarySearchTree.isSorted(data);
		Assert.assertFalse(result);
	}
	
	@Test
	public void test_ArrayWithNoUniques_ShouldBeTrue() {
		List<Integer> data = Arrays.asList(1,1,1);
		boolean result = ValidateBinarySearchTree.isSorted(data);
		Assert.assertFalse(result);
	}

}
