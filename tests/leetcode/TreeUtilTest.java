package leetcode;

import static org.junit.Assert.*;

import java.util.logging.Level;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import helpers.TreeUtils;
import models.TreeNode;

public class TreeUtilTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateTree() {
		TreeNode root =TreeUtils.createTree(new int[]{0, 1, 2, 3, 4, 5, 6});
		TreeUtils.printLevelOrder(root);
	}

}
