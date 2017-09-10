/**
 * 
 */
package leetcode;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import helpers.TwoSumTestHelper;
import helpers.TwoSumTestHelper.TwoSumTestCase;
import junit.framework.Assert;

/**
 * @author Jay Patel
 *
 */
public class TwoSumTest {

	private static TwoSumTestHelper helper;
	private static List<TwoSumTestCase> testCases;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		helper = new TwoSumTestHelper();
		testCases = helper.loadTestCases("tests/data/twosumdata.txt");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link leetcode.TwoSum#twoSum(int[], int)}.
	 */
	@Test
	public void testTwoSum() {
		for (TwoSumTestCase testCase : testCases) {
			int[] result = TwoSum.twoSum(testCase.data, testCase.target);
			int[] expected_result = testCase.result.clone();
			Arrays.sort(expected_result);
			Arrays.sort(result);
			assertArrayEquals("Pass", expected_result , result);
		}
	}

}
