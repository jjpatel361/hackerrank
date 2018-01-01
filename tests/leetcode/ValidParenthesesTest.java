/**
 * 
 */
package leetcode;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Jay Patel
 *
 */
public class ValidParenthesesTest {

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
	 * Test method for {@link leetcode.ValidParentheses#isValid(java.lang.String)}.
	 */
	@Test
	public void testIsValid_NestedString_ShouldPass() {
		String teststr =  "({[]})";
		boolean actual = ValidParentheses.isValid(teststr);
		org.junit.Assert.assertTrue(actual);
	}
	
	@Test
	public void testIsValid_NonNestedString_ShouldPass(){
		String teststr =  "(){}[]";
		boolean actual = ValidParentheses.isValid(teststr);
		org.junit.Assert.assertTrue(actual);
	}

	
	@Test
	public void testIsValid_OddLengthedString_ShouldBeFalse(){
		String teststr =  "(){";
		boolean actual = ValidParentheses.isValid(teststr);
		org.junit.Assert.assertFalse(actual);
	}
	
	
	@Test
	public void testIsValid_IncorrectCombination_ShouldBeFalse(){
		String teststr =  "(){}[{]}";
		boolean actual = ValidParentheses.isValid(teststr);
		org.junit.Assert.assertFalse(actual);
	}

	@Test
	public void testIsValid_IncorrectCombination2_ShouldBeFalse(){
		String teststr =  "(}(({(}()(({)](({[";
		boolean actual = ValidParentheses.isValid(teststr);
		org.junit.Assert.assertFalse(actual);
	}

	
	@Test
	public void testIsValid_ClosingBracketsOccuringFirst_ShouldBeFalse(){
		String teststr =  "){";
		boolean actual = ValidParentheses.isValid(teststr);
		org.junit.Assert.assertFalse(actual);
	}
	
	@Test
	public void testIsValid_OnlyOpeningBrackets_ShouldBeFalse(){
		String teststr =  "((";
		boolean actual = ValidParentheses.isValid(teststr);
		org.junit.Assert.assertFalse(actual);
	}

}
