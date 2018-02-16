package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JudgeCircleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testJudgeCircle_BasicMoves1_ShouldBeTrue() {
		String moves = "UD";
		boolean answer = JudgeCircle.judgeCircle(moves);
		Assert.assertTrue(answer);
	}
	
	@Test
	public void testJudgeCircle_SameMoves_ShouldBeFalse() {
		String moves = "LL";
		boolean answer = JudgeCircle.judgeCircle(moves);
		Assert.assertFalse(answer);
	}
	
	@Test
	public void testJudgeCircle_BasicMoves_ShouldBeFalse() {
		String moves = "DURDLDRRLL";
		boolean answer = JudgeCircle.judgeCircle(moves);
		Assert.assertFalse(answer);
	}

}
