package ctci;

public class ShiftStringArray {

	/*
	 * ctci 1.3
	 * 
	 * */
	public static void main(String[] args) {
		//String p = "Jay Patel  ";
		String p = "Mr Jagpreet Singh Rubal      ";
		
		System.out.println("Test String : " +  p  + " Length " + p.length());
		char[] result = replaceSpaces(p.toCharArray());
		System.out.println(new String(result));
	}

	private static char[] replaceSpaces(char[] cs) {
		
		int no_of_spaces= 0, shift_window = 0, index = cs.length - 1;
		
		while(cs[index] == ' ') {index--;};
		int end_index = index;
		
		// count spaces and last active index
		for (int i = index; i >= 0; i--) {
			if(cs[i] == ' ') {
				no_of_spaces++;
			}
		}
		
		System.out.println("Last Active Index " + end_index + " No of spaces " + no_of_spaces);
		
		// calculate shift window size 
		shift_window = no_of_spaces* 2;
		int spaces = no_of_spaces;
		
		// start shifting
		index = end_index;
		while(spaces > 0) {
			//System.out.println(index + " S: " + shift_window + " Spaces: " + spaces);
			if(cs[index] != ' ') {
				cs[shift_window + index] = cs[index];
				cs[index] = ' ';
			}else {
				//System.out.println("Space occured in index " + index);
				// recalculate shift 
				spaces--;
				shift_window = 2*spaces;
				// also insert 
				cs[shift_window + index] = '%';
				cs[shift_window + index+1] = '2';
				cs[shift_window + index+2]='0';
				//System.out.println(Arrays.toString(cs));
			}
			index--;
			
		}
		
		return cs;
	}
	
	

}
