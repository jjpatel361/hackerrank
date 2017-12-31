package leetcode;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThreeSumTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_BasicArray() {
		int[] data = new int[]{-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = ThreeSum.threeSum(data);
		Assert.assertEquals(2, result.size());
	}
	
	@Test
	public void test_ArrayLessThanSize3_ShouldReturnEmpty() {
		int[] data = new int[]{-2,2};
		List<List<Integer>> result = ThreeSum.threeSum(data);
		Assert.assertTrue(result.isEmpty());
	}

}
