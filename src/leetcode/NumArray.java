/**
 * 
 */
package leetcode;



/**
 * @author Jay Patel
 *
 */
public class NumArray {
	
	public static class SegmentNode {
		int start_index;
		int end_index;
		int range_sum;
		SegmentNode left;
		SegmentNode right;
		
		public SegmentNode(){
			
		}
		
		@Override
		public String toString(){
			return "S: " + this.start_index + " E: " + this.end_index + " RS: " + this.range_sum;
		}
		
	}

	private static int sumRange(SegmentNode tree, int i, int j) {
		//System.out.println("NSI: " + tree.start_index + " NEI: " + tree.end_index + " SI:" + i + " EI:" + j);
		if( i <= tree.start_index &&  j >= tree.end_index ){
			//System.out.println("Inside Range");
			return tree.range_sum;
		}else if(
					(tree.start_index < i && tree.end_index < i)
					
					|| 
					
					(tree.start_index > j) && (tree.end_index > j)
				) {
			//System.out.println("Outside Range");
			return 0;
		}else{
			//System.out.println("Partial Range");
			int leftSum = sumRange(tree.left, i, j);
			int rightSum = sumRange(tree.right, i, j);
			return leftSum + rightSum;
		}
	}

	private static SegmentNode createTree(int[] data, int startIndex, int endIndex) {
		
		if(startIndex == endIndex) {
			
			// return base node
			SegmentNode s = new SegmentNode();
			s.start_index = startIndex;
			s.end_index = endIndex;
			s.range_sum = data[startIndex];
			return s;
			
		}else {
			// find mid point
			int mid = (int) Math.floor((endIndex + startIndex)/ 2);
			SegmentNode left = createTree(data, startIndex, mid);
			SegmentNode right = createTree(data, mid +1 , endIndex);
		//	System.out.println("Merging Left Node  " + left.toString() + " with " + right.toString());
			SegmentNode parent = mergeSegmentNodes(left, right);
			return parent;	
		}
	}

	private static SegmentNode mergeSegmentNodes(SegmentNode left, SegmentNode right) {
		SegmentNode s = new SegmentNode();
		s.start_index = left.start_index;
		s.end_index = right.end_index;
		s.range_sum = left.range_sum + right.range_sum;
		s.left = left;
		s.right = right;
		return s;
	}
	
	
	SegmentNode tree = null;
	
	public NumArray(int[] nums) {
		if(nums.length != 0) {
			tree = createTree(nums, 0, nums.length-1);
		}else{
			tree = null;
		}
		
	}

	public int sumRange(int i, int j) {
		if(tree == null) return 0; 
		return sumRange(tree, i, j);
	}
	
	public static void main(String[] args) {
		int[] data = new int[]{-2, 0, 3, -5, 2, -1};
		NumArray n = new NumArray(new int[]{});
		int result = n.sumRange(0, 5);
		System.out.println("Result : " + result);
		
	}

}
