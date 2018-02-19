package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSortedArrayTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMerge_Basic() {
		int[] nums1 = new int[4];
		nums1[0] = 1;
		nums1[1] = 4;
		int[] nums2 = new int[3];
		nums2[0] = 2;
		
		int[] expected = new int[]{1,2,4,0};
		MergeSortedArray.merge(nums1, 2, nums2, 1);
		int[] actual = MergeSortedArray.nums1;
		Assert.assertArrayEquals(expected, actual);	
	}
	
	@Test
	public void testMerge_OneArrayEmpty_ShouldReturnAnotherArray(){
		int[] nums1 = new int[1];
		// nums1 = [0]
		int[] nums2 = new int[1];
		nums2[0] = 1;
		MergeSortedArray.merge(nums1, 0, nums2, 1);
		int[] expected = new int[]{1};
		Assert.assertArrayEquals(expected, MergeSortedArray.nums1);
		Assert.assertEquals(nums1.length, MergeSortedArray.nums1.length);
	}

}
