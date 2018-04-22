/**
 * 
 */
package leetcode;

import models.TreeNode;
import java.util.*;

/**
 * @author Jay Patel
 *
 */
public class PathSum2 {
	
	static List<List<Integer>> res ;
	

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		// reset static variables
		res = new ArrayList<List<Integer>>();
		
		if(root != null) {
			traverse(root, sum, 0, new ArrayList<Integer>());
		}
		
		System.out.println("Walking complete..");
		
		for (List<Integer> list : res) {
			System.out.println(Arrays.toString(list.toArray()));
		} 
		
		return res;
	}
	
	public static void traverse(TreeNode root, int target, int explored_sum, ArrayList<Integer> path) {
		
		//leaf node
		if(root.left == null && root.right == null) {
			int explored = explored_sum + root.val;
			if(explored == target) {
				path.add(root.val);
				System.out.println("Walk stop.");
				System.out.println(Arrays.toString(path.toArray()));
				res.add(path);
			}else {
				System.out.println("Exiting at node " + root.val);
			}
			return;
		} else {
			// other nodes
			int explored = explored_sum + root.val;
			path.add(root.val);
						
			System.out.println("Explored..");
			
			if(root.left != null) {
				System.out.println("Left walking..");
				ArrayList<Integer> left_tmp = new ArrayList<>(path);
				System.out.println(Arrays.toString(left_tmp.toArray()));
				traverse(root.left, target, explored, left_tmp);
				System.out.println("Left walk complete..");
			}
			
			if(root.right != null) {
				System.out.println("Right walking..");
				ArrayList<Integer> right_tmp = new ArrayList<>(path);
				System.out.println(Arrays.toString(right_tmp.toArray()));
				traverse(root.right, target, explored, right_tmp);
				System.out.println("Right walk complete..");
			}
			return;
		}
	}
	
}

