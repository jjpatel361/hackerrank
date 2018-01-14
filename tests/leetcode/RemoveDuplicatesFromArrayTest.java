package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RemoveDuplicatesFromArrayTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_basic_shouldpass() {
		int[] data = new int[]{1,1,2,3,4,5,5,6};
		int len = RemoveDuplicatesFromArray.removeDuplicates(data);
		Assert.assertEquals(6, len);
	}
	
	@Test
	public void test_NoDuplicatesArray_ShouldReturnOne() {
		int[] data = new int[]{1,1,1,1,1,1,1,1,1};
		int len = RemoveDuplicatesFromArray.removeDuplicates(data);
		Assert.assertEquals(1, len);
	}

}
