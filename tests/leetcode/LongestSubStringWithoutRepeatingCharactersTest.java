/**
 * 
 */
package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Jay Patel
 *
 */
public class LongestSubStringWithoutRepeatingCharactersTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link leetcode.LongestSubStringWithoutRepeatingCharacters#lengthOfLongestSubstring(java.lang.String)}.
	 */
	@Test
	public void testLengthOfLongestSubstring_BasicTest_ShouldPass() {
		String teststr = "pwwkew";
		int actual = LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring(teststr);
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void testLengthOfLongestSubstring_RepeatedLetters_ShouldPass() {
		String teststr = "bbbbb";
		int actual = LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring(teststr);
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void testLengthOfLongestSubstring_UniqueCharacterString_ShouldPass() {
		int actual = LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("au");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void testLengthOfLongestSubstring_NullParameter_ShouldReturnZero() {
		int actual = LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring(null);
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void testLengthOfLongestSubstring_EmptyString_ShouldReturnZero() {
		int actual = LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("");
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void testLengthOfLongestSubstring_SingleLetterString_ShouldReturn1() {
		int actual = LongestSubStringWithoutRepeatingCharacters.lengthOfLongestSubstring("a");
		Assert.assertEquals(1, actual);
	}

}
