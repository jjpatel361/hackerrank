/**
 * 
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class FindBottomLeftTreeValue {

	public static int findBottomLeftValue(TreeNode root) {
		
		// level order traversal
		Queue<TreeNode> level = new LinkedList<>();
		level.add(root);
		int current_level = level.size();
		int left_most_val = 0;
		int max_size = level.size();
		
		while(!level.isEmpty()) {
			
			while(current_level > 0) {
				
				// first element is the left most 
				TreeNode n = level.poll();
				// ensures only 1st element overrides variable
				if(max_size == current_level) {
					left_most_val = n.val;
				}
				
				if(n.left != null) level.add(n.left);
				
				if(n.right != null) level.add(n.right);
				current_level--;
			}
			
			// next level size 
			current_level = level.size(); 
			max_size = level.size();
					
		}
		
		return left_most_val;
	}

}
