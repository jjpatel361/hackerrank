package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class NumArrayTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testSumRange() {
		int[] nums = new int[]{3,4,5,6};
		NumArray c = new NumArray(nums);
		int actual_result = c.sumRange(1, 2);
		Assert.assertEquals(9, actual_result);
	}

	@Ignore
	public void testUpdate_BasicNumUpdate_ShouldPass() {
		int[] nums = new int[]{3,4,5,6};
		NumArray c = new NumArray(nums);
		int actual_result = c.sumRange(1, 2);
		Assert.assertEquals(7, actual_result);
		
	}
}
