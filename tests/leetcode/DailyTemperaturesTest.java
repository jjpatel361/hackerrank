package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DailyTemperaturesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDailyTemperatures_BasicTest_ShouldPass() {
		int[] testdata = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
		int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
		int[] actual = DailyTemperature.dailyTemperatures(testdata);
		Assert.assertArrayEquals(expected, actual);
		
	}

}
