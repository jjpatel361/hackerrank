package helpers;

import java.util.LinkedList;
import java.util.Queue;

import models.TreeNode;

public class TreeUtils {
	
	public static TreeNode createTree(int[] data) {
		return recurse(data, 0);
	}

	private static TreeNode recurse(int[] data, int i) {
		TreeNode t = null;
		
		if(i < data.length - 1) {
			t = new TreeNode(data[i]);
			t.left = recurse(data, 2*i + 1);
			t.right = recurse(data, 2*i + 2);
			return t;
		}else{
			return null;
		}
		
	}

	//TODO: avoid last row of all nulls to be printed.
	public static void printLevelOrder(TreeNode root) {
		if(root == null ) {
			System.out.println("=======NULL TREE========");
		}
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
 		q.add(root);
 		int current_level = 0;
 		int inqueue = 1;
 		StringBuilder sb = null;
 		while(!q.isEmpty()) {
 			System.out.println("=============" + " LEVEL " + current_level + "=============" );
 			
 			sb = new StringBuilder();
 			
 			while(inqueue > 0) {
 				
 				inqueue--;
 				
 				TreeNode d = q.poll();
 				
 				if(d != null) {
 					sb.append( " [ " + d.val  + " ] ");
 					q.add(d.left);
 	 				q.add(d.right);
 				}else {
 					sb.append(" [ null ] ");
 				}
 				
 			}
 			
 			System.out.println(sb.toString());
 			current_level++;
 			inqueue = q.size();
 		}
		
		
	} 

}
