package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class KthLargestTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindKthLargest_BasicArray_ShouldPass() {
		int[] nums = new int[]{3,2,1,5,6,4};
		int k = 2;
		int actual = KthLargest.findKthLargest(nums, k);
		Assert.assertEquals(5, actual);
	}

	@Test
	public void testFindKthLargest_BasicArray2_ShouldPass() {
		int[] nums = new int[]{3,2,1,4};
		int k = 2;
		int actual = KthLargest.findKthLargest(nums, k);
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void testPartitioning() {
		int[] nums = new int[]{3,2,1,5,6,4};
		int smallestNumber = KthLargest.partition(nums, 0, nums.length-1, 2);
		Assert.assertEquals(2, smallestNumber);
	}


}
