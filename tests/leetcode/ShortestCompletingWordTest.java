package leetcode;

import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;



public class ShortestCompletingWordTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testShortestCompletingWord_BasicTest() {
		String licensePlate = "1s3 PSt";
		String[] words = new String[]{"step", "steps", "stripe", "stepple"};
		String actual = ShortestCompletingWord.shortestCompletingWord(licensePlate, words);
		Assert.assertEquals("steps", actual);
	}
	
	@Test
	public void testShortestCompletingWord_BasicTest2() {
		String licensePlate = "Ah71752";
		String[] words = new String[]{"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
		String actual = ShortestCompletingWord.shortestCompletingWord(licensePlate, words);
		Assert.assertEquals("husband", actual);
	}
	
	@Test
	public void testShortestCompletingWord_SingleLetter_ShouldReturnMinLengthWord() {
		String licensePlate = "1s3 456";
		String[] words = new String[]{"looks","pest","stew","show"};
		String actual = ShortestCompletingWord.shortestCompletingWord(licensePlate, words);
		Assert.assertEquals("pest", actual);
	}

}
