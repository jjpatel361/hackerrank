/**
 * 
 */
package leetcode;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.*;

/**
 * @author Jay Patel
 *
 */
public class GroupAnagramsTest {

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
	 * Test method for {@link leetcode.GroupAnagrams#groupAnagrams(java.lang.String[])}.
	 */
	@Test
	public void testGroupAnagrams_BasicString_ShouldPass() {
		String[] data = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = GroupAnagrams.groupAnagrams(data);
		Assert.assertEquals(3, result.size());
	}

}
