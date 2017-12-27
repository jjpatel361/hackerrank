package leetcode;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class SingleElementInSortedArrayTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void test_ElementAtStartIndex() {
		int repeatingNumber = SingleElementInSortedArray.singleNonDuplicate(new int[]{1,2,2});
		assertThat(1, is(equalTo(repeatingNumber)));
	}
	
	@Test
	public void test_ElementInMiddle() {
		int repeatingNumber = SingleElementInSortedArray.singleNonDuplicate(new int[]{1,1,2,2,3,3,4,5,5,6,6});
		assertThat(4, is(equalTo(repeatingNumber)));
	}
	
	@Test
	public void test_ElementInLast() {
		int repeatingNumber = SingleElementInSortedArray.singleNonDuplicate(new int[]{1,1,2,2,3,3,4,4,5,5,6});
		System.out.println(repeatingNumber);
		assertThat(
					6, 
						is(equalTo(repeatingNumber))
					);
		
	}
	

}
