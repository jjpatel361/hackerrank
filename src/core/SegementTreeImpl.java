package core;

public class SegementTreeImpl {

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
	
	public static void main(String[] args) {
		int[] data = new int[]{1, 3, 5, 7, 9, 11};
		SegmentNode tree = createTree(data, 0 , data.length - 1);	
		
		int sum = sumRange(tree, 2, 4);
		System.out.println("Sum : " + sum);
		System.out.println("***********************************");
		System.out.println("Sum : " + sumRange(tree, 5, 5) );
		System.out.println("***********************************");
	}

	private static int sumRange(SegmentNode tree, int i, int j) {
		System.out.println("NSI: " + tree.start_index + " NEI: " + tree.end_index + " SI:" + i + " EI:" + j);
		if( i <= tree.start_index &&  j >= tree.end_index ){
			System.out.println("Inside Range");
			return tree.range_sum;
		}else if(
					(tree.start_index < i && tree.end_index < i)
					
					|| 
					
					(tree.start_index > j) && (tree.end_index > j)
				) {
			System.out.println("Outside Range");
			return 0;
		}else{
			System.out.println("Partial Range");
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
			System.out.println("Merging Left Node  " + left.toString() + " with " + right.toString());
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
	
	

}
