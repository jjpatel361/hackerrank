package leetcode;

public class RepeatedStringMatch {

	public static void main(String[] args) {
		//System.out.println(repeatedStringMatch("aa", "a"));
		//System.out.println(repeatedStringMatch("abaabaa", "abaababaab"));
		System.out.println(repeatedStringMatch("a", "a"));
		//System.out.println(repeatedStringMatch("abcd","cdass"));
	}

	public static int repeatedStringMatch(String seed_str, String tree_str) {
		
		//TODO: Edge case check if any of elements are null or empty return -1
		
		if(!isSubString(seed_str, tree_str)){
			System.out.println("Not a substring. Exiting prematurely");
			return  -1;
		};
		
		char[] seed = seed_str.toCharArray();
		char[] tree = tree_str.toCharArray();
		
		// find start point 
		int start_index = -1;
		for (int i = 0; i < seed.length; i++) {
			if(seed[i] == tree[0]) {
				start_index = i; // first matching character found
				break;
			}
		}
		
		if(start_index == -1) {
			System.out.println("First character is not in seed. Exit");
			return -1;
		}
		
		int count = 0;
		int len = seed.length;
		for (int cursor = 0; cursor < tree.length; cursor++) {
			
			if(tree[cursor] != seed[start_index]) {
				System.out.println("Unknown character found.Exit");
				count = -1;
				break;
			}else {
				start_index++;
				if(start_index >= len) {
					// resetting to start
					count++;
					start_index = start_index%(len);
				}
			}
		}
		
		// if there is any residue then last part needs to be counter
		if(count != -1 && start_index != 0) {
			System.out.println("start index ended at " + start_index);
			count++;
		}
		
		return count;
	}

	/**
	 * @param seed_str
	 * @param tree_str
	 * @return 
	 */
	public static boolean isSubString(String seed_str, String tree_str) {
		
		if(
				seed_str == null || 
				tree_str == null || 
				"".equalsIgnoreCase(seed_str) ||
				"".equalsIgnoreCase(tree_str) ||
				seed_str.length() > tree_str.length()
				
				) {
			return false;
		}
		
		if(seed_str.equalsIgnoreCase(tree_str)) {
			return true;
		}
		
		
		char[] seed = seed_str.toCharArray();
		char[] tree = tree_str.toCharArray();
		
		boolean seedFound = false;
		
		// Check if seed exists in tree.
		int seed_ptr = 0;
		for(int i = 0;i < tree.length; i++ ) {
			if(seed[seed_ptr] == tree[i] ) {
				System.out.println("--------------------");
				// start comparison from here
				int k = i;
				int p = 0;
				boolean isSubstring = true;
				while(p < seed.length) {
					System.out.println("S:" + seed[p] + " T: "  + tree[k]);
					if(seed[p] == tree[k]) {
						// move forward to comparison
						p++;
						k++;
						
						//bad hack
						if(k >= tree.length) {
							// false trigger 
							isSubstring = false;
							System.out.println("--------------------");
							break;
						}
						
						
					}else {
						// false trigger 
						isSubstring = false;
						System.out.println("--------------------");
						break;
					}
				}
				if(isSubstring) {
					seedFound = true;
					break;
				}
			}	
			
		}
		
		return seedFound;
	}

}
