package leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueReconstructionTest {

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
	public void test_WithSmallArray() {
		int[][] people = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		int[][] expected = new int[][]{{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
		int[][] actual = QueueReconstruction.reconstructQueue(people);
		assertArrayEquals(expected, actual);
		
	}

}
