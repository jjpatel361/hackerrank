/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class WordSearch {

	public static void main(String[] args) {
			char[][] board = new char[3][4];
			board[0] = new char[]{'A','B','C','E'};
			board[1] = new char[]{'S','F','E','S'};
			board[2] = new char[]{'A','D','E','E'};
			boolean result = exist(board, "ABCESEEEFS");
			System.out.println("Result " + result);
	}

	public static boolean exist(char[][] board, String word) {
		
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if(word.charAt(0) == board[row][col]) {
					boolean result = dfs(board, word, 0, new boolean[board.length][board[0].length], row, col);
					if (result) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean dfs(char[][] board, String word, int currentLetterIndex, boolean[][] explored, 
			int current_x, int current_y) {
		

		// base condition
		if(currentLetterIndex == word.length() - 1) return true;
		
		// see if current x , y  == word letter
		if(board[current_x][current_y] != word.charAt(currentLetterIndex)) {
			return false;
		}
		
		explored[current_x][ current_y] = true;
		
		currentLetterIndex++;
		
		// mark node visited
		explored[current_x][current_y] = true;
		
		//boolean left_traversal = false, right_traversal = false, top_traversal=false, bottom_traversal = false;
		boolean solutionFound = false;
		
		System.out.println("CurrentNode : " +  board[current_x][current_y]);
		// get left node index
		int left = current_y -1;
		if(left >= 0 
				&& !explored[current_x][left] 
				&& board[current_x][left] == word.charAt(currentLetterIndex)) {
			
			System.out.println("Exploring Left Node : " + board[current_x][left]);
			solutionFound = dfs(board, word, currentLetterIndex, explored, current_x, left);
			System.out.println("Returning from Exploration Node :" + board[current_x][left]);
			
		} 
		
		// get right node index
		int right = current_y + 1;
		if(right < board[0].length 
				&& !explored[current_x][right] 
				&& board[current_x][right] == word.charAt(currentLetterIndex) 
				&& !solutionFound){
			System.out.println("Exploring Right Node : " + board[current_x][right]);
			solutionFound = dfs(board, word, currentLetterIndex, explored, current_x, right);
			System.out.println("Returning from Exploration : "+  board[current_x][right]);
		}
		
		int top = current_x - 1;
		if(top >= 0 
				&& !explored[top][current_y] 
				&& board[top][current_y] == word.charAt(currentLetterIndex)
				&& !solutionFound
				) {
			System.out.println("Exploring Top Node : " + board[top][current_y]);
			solutionFound = dfs(board, word, currentLetterIndex, explored, top, current_y);
			System.out.println("Returning from Exploration :" + board[top][current_y]);
		}
		
		int bottom = current_x +1;
		if(bottom < board.length
				&& !explored[bottom][current_y]
				&& board[bottom][current_y] == word.charAt(currentLetterIndex)
				&& !solutionFound) {
			System.out.println("Exploring Bottom Node : " + board[bottom][current_y]);
			solutionFound = dfs(board, word, currentLetterIndex, explored, bottom, current_y);
			System.out.println("Returning from Exploration :" + board[bottom][current_y]);
		}
		
		
		if(!solutionFound) {
			explored[current_x][current_y] = false;
			System.out.println("Resetting Node Exploration Flag.");
		}
		
		return solutionFound;
	}

}
