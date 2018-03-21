/**
 * 
 */
package core;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class MyStringBuilder {
	
	public static char[] value;
	int capacity = 5;
	int count = 0;
	
	public MyStringBuilder(){
		value = new char[capacity];
	}
	
	private void append(Object d) {
		String str = String.valueOf(d);
		if((count + str.length()) > capacity) {
			// resize 
			int new_capacity = 2*value.length;
			value = Arrays.copyOf(value, new_capacity);
			System.out.println("Resizing to :"  + value.length);
			capacity = new_capacity;
		}
		str.getChars(0, str.length(), value, count);
		count += str.length();
	}
	
	@Override
	public String toString(){
		return new String(value);
	}

	public static void main(String[] args) {
		
//		StringBuilder sb = new StringBuilder();
//		String[] data = new String[]{"Jay", "Patel", "Developer", "FullStack", "Web", "Java"};
//		for (String d : data) {
//			sb.append(d);
//		}
//		System.out.println(sb.toString());
		
//		MyStringBuilder sb = new MyStringBuilder();
//		sb.append("Jay"); // 3  | capacity = 5
//		sb.append("Patel"); // 3 + 5 = 8 || new capacity = 10
//		sb.append("Web"); //  8 + 3 = 11 || new capacity = 20
//		System.out.println(Arrays.toString(value));
//		System.out.println(sb.toString());
		
		
//		int[] ascii = new int[2];
//		int i = 1;
//		//ascii[i]++;
//		ascii[i++]++;
//		System.out.println(Arrays.toString(ascii));
//		System.out.println(i+ "");
		
		String  s = "Jay Patel";
		char[] p = s.toCharArray();
		int last_char = p.length - 1;
		for (int i = 0; i < p.length / 2 ; i++) {
			char c = p[i];
			p[i] = p[last_char];
			p[last_char] =  c;
			last_char--;
		}
		String d = String.valueOf(p);
		System.out.println();
	}

}


