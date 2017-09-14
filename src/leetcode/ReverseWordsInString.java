package leetcode;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = " a    b  c             d";
		System.out.println(reverseWords(s));

	}

		
	/*Beats 10%*/
	private static String reverseWords(String s) {
		if(s.isEmpty() || s == "" || s.trim() == "") {
			return "";
		}

		String[] words = s.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length-1; i >= 0; i--) {
			if(!words[i].isEmpty()) {
				sb.append(words[i]).append(" ");
			}
		}
		
		return sb.toString().trim();
	}
	
	/*Beats 0.5 % :( */
	/*public static String reverseWords(String s) {
		// Simplest way is to store it in stack
		s = s.replaceAll("\\s{2,}", " ");
		String[] words = s.split(" ");
		Stack<String> stack = new Stack<String>();	
		Arrays.stream(words).forEach(word -> stack.push(word));
		String result = "";
		while(!stack.isEmpty()) {
			result += stack.pop() + " ";
		}
		return result.trim();
    }*/
}
