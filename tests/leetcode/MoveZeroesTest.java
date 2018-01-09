package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoveZeroesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMoveZeroes_ArrayStartingWith0_ShouldPass() {
		int[] p = new int[]{0, 1, 0, 3, 12};
		int[] expected = new int[]{1, 3, 12, 0, 0};
		MoveZeroes.moveZeroes(p);
		Assert.assertArrayEquals(expected, MoveZeroes.nums);	
	}
	
	@Test
	public void testMoveZeroes_ArrayStartingWithNonZero_ShouldPass() {
		int[] p = new int[]{1, 1, 0, 3, 12};
		int[] expected = new int[]{1, 1, 3, 12, 0};
		MoveZeroes.moveZeroes(p);
		Assert.assertArrayEquals(expected, MoveZeroes.nums);	
	}

}
