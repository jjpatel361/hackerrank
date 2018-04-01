package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MinStackTest {

	MinStack m;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		m = new MinStack();
	}

	@Test
	public void test_MinStack_1() {
		m = new MinStack();
		m.push(-2);
		m.push(0);
		m.push(-3);
		assertEquals(-3, m.getMin());
		m.pop();
		assertEquals(0, m.top());
		assertEquals(-2, m.getMin());		
	}
	
	@Test
	public void test_MinStack_2() {
		m.push(1);
		m.push(2); // so far min 1-> 2
		assertEquals(2, m.top());
		assertEquals(1, m.getMin());
		m.pop(); // 2 is thrown out 
		assertEquals(1, m.getMin());
		m.top();
		
	}

}
