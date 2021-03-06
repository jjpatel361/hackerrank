/**
 * 
 */
package ctci;

import java.util.BitSet;

import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class MinimalBST {

	public static void main(String[] args) {
		//TreeNode r = sortedArrayToBST(new int[]{-10,-3,0,5,9});
		//TreeNode r = sortedArrayToBST(new int[]{-10,-3,0,5,9,10});
		//TreeNode r = sortedArrayToBST(new int[]{});
		//TreeNode r = sortedArrayToBST(new int[]{0});
		//@SuppressWarnings("unused")
		//TreeNode r = sortedArrayToBST(new int[]{-1, 0, 1, 2});
		/*BitSet b = new BitSet(5);
		b.set(0, false);
		b.set(1, false);
		b.set(2, true);
		b.set(3, false);
		b.set(4, false);
		System.out.println(b.size());*/
		BitSet b = new BitSet(65);
		System.out.println(b.size() + " length " + b.length());
	}
	
	public static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
		if(nums.length == 1) return new TreeNode(nums[0]);
		return buildTree(nums, 0, nums.length -1);	
	}
	private static TreeNode buildTree(int[] nums, int start_index, int end_index) {
		
		// base case
		// with just three elements
		// make the center with root
		if(start_index > end_index) {
			return null;
		}
		
		if(start_index == end_index) {
			return new TreeNode(nums[start_index]);
		}
		
		int midpoint = ((end_index - start_index)/ 2) + start_index;
		
		TreeNode root = new TreeNode(nums[midpoint]);
		root.left = buildTree(nums, start_index , midpoint - 1);
		root.right = buildTree(nums, midpoint + 1, end_index);
		
		return root;
	}
}
