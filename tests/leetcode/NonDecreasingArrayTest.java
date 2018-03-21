package leetcode;

import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class NonDecreasingArrayTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testCheckPossibility_BasicTest() {
		int[] test = new int[]{4, 2, 3};
		boolean result = NonDecreasingArray.checkPossibility(test);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCheckPossibility_BasicTest2() {
		int[] test = new int[]{3, 4, 2, 3};
		boolean result = NonDecreasingArray.checkPossibility(test);
		Assert.assertFalse(result);
	}
	
	@Test 
	public void testCheckPossibility_BasicTest3() {
		int[] test = new int[]{4, 2, 1};
		boolean result = NonDecreasingArray.checkPossibility(test);
		Assert.assertFalse(result);
	}
	
	@Test 
	public void testCheckPossibility_NegativeNumberTest() {
		int[] test = new int[]{-1,4,2,3};
		boolean result = NonDecreasingArray.checkPossibility(test);
		Assert.assertFalse(result);
	}


}
