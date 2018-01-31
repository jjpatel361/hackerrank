/**
 * 
 */
package leetcode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Jay Patel
 *
 */
public class WordBreakTest {

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
	 * Test method for {@link leetcode.WordBreak#wordBreak(java.lang.String, java.util.List)}.
	 */
	@Test
	public void testWordBreak_InitialWord_ShouldPass() {
		List<String> dict = new ArrayList<String>();
		dict.add("leet");
		dict.add("code");
		String test_string = "leetcode";
		boolean result = WordBreak.wordBreak(test_string, dict);
		assertTrue(result);
	}
	
	@Test
	public void testWordBreak_MultipleWords_ShouldPass() {
		List<String> dict = new ArrayList<String>();
		dict.add("leet");
		dict.add("co");
		dict.add("de");
		String test_string = "leetcode";
		boolean result = WordBreak.wordBreak(test_string, dict);
		assertTrue(result);
	}
	
	@Test
	public void testWordBreak_DuplicateWordsInDictionary_ShouldBeHandled() {
		List<String> dict = new ArrayList<String>();
		dict.add("aaaa");
		dict.add("aaa");
		String test_string = "aaaaaaa";
		boolean result = WordBreak.wordBreak(test_string, dict);
		assertTrue(result);
	}
	
	
	@Ignore
	public void testWordBreak_SubSetStrings_ShouldBeHandled() {
		List<String> dict = new ArrayList<String>();
		
		dict.add("a");
		dict.add("b");
		dict.add("bbb");
		dict.add("bbbbb");
		
		String test_string = "bb";
		boolean result = WordBreak.wordBreak(test_string, dict);
		assertTrue(result);
	}
	
	@Test
	public void testWordBreak_EmptyDictonary_ShouldFail() {
		List<String> dict = new ArrayList<String>();
		String test_string = "a";
		boolean result = WordBreak.wordBreak(test_string, dict);
		assertFalse(result);
	}
	
	@Test
	public void testWordBreak_WrongDictionary_ShouldFail() {
		List<String> dict = new ArrayList<String>();
		dict.add("b");
		String test_string = "a";
		boolean result = WordBreak.wordBreak(test_string, dict);
		assertFalse(result);
	}
	
	@Test
	public void testWordBreak_ExactWordInDictionary_ShouldPass() {
		List<String> dict = new ArrayList<String>();
		dict.add("a");
		String test_string = "a";
		boolean result = WordBreak.wordBreak(test_string, dict);
		assertTrue(result);
	}

}
