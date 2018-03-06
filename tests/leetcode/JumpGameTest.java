package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JumpGameTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCanJump() {
		boolean res = JumpGame.canJump(new int[]{2,3,1,1,4});
		assertTrue(res);
		
	}
	
	@Test
	public void testCanJump2() {
		boolean res = JumpGame.canJump(new int[]{3,2,1,0,4});
		assertFalse(res);
		
	}
	
	@Test
	public void testCanJump3() {
		boolean res = JumpGame.canJump(new int[]{1});
		assertTrue(res);
	}
	
	@Test
	public void testCanJump4() {
		boolean res = JumpGame.canJump(new int[]{0, 1});
		assertFalse(res);
	}
	
	

}
