package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountingBitsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCountBits() {
		int num = 2;
		int[] expected = new int[]{0, 1, 1};
		int[] actual = CountingBits.countBits(num);
		System.out.println(actual);
		Assert.assertArrayEquals(expected, actual);
	}

}
