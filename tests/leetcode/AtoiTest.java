package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AtoiTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_Basic_TwoDigit_ShouldPass() {
		String str = "23";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(23, rs);
	}
	
	@Test
	public void test_Basic_ThreeDigit_ShouldPass() {
		String str = "231";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(231, rs);
	}
	
	@Test
	public void test_Basic_OnlySymbol_ShouldReturnZero() {
		String str = "+";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(0, rs);
	}
	
	@Test
	public void test_Basic_NegativeNumbers_ShouldPass() {
		String str = "-23";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(-23, rs);
	}
	
	@Test
	public void test_Basic_PositiveNumbers_ShouldPass() {
		String str = "+23";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(23, rs);
	}
	
	@Test
	public void test_EmptyString_ShouldReturnZero() {
		String str = "";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(0, rs);
	}
	
	@Test
	public void test_StringWithMultipleSignCharacters_ShouldBeReturnZero() {
		String str = "+-23";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(0, rs);
	}
	
	@Test
	public void test_StringWithPrefixZero_ShouldAvoidZeros() {
		String str = "010";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(10, rs);
	}
	
	@Test
	public void test_NumberWithSpaces_ShouldBeReturnZero() {
		String str = "    010";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(10, rs);
	}
	
	@Test
	public void test_NumberWithAlphnumericCharacters_ShouldIgnoreStrAfterAlphaNumeric() {
		String str = "  -0012a42";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(-12, rs);
	}
	
	@Test
	public void test_NumberWithSpaceBetweenNumbers_ShouldIgnoreStrAfterSpace() {
		String str = "  +7 123";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(7, rs);
	}

	@Test
	public void test_LargeNegativeNumber_ShouldReturnIntegerMin() {
		String str = "-2147483649";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(-2147483648, rs);
	}
	
	@Test
	public void test_LargePositiveNumber_ShouldReturnIntegerMax() {
		String str = "2147483648";
		int rs = Atoi.myAtoi(str);
		Assert.assertEquals(2147483647, rs);
	}
	

}
