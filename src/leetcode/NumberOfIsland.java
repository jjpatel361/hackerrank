/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class NumberOfIsland {
	
	static int countIsland;
	
	public int numIslands(char[][] grid) {
		countIsland = 0;
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[0].length; col++ ){
				System.out.println("Current Value grid[row][col]");   
				if(grid[row][col] == '1' && !visited[row][col]) {
					if(dfs(grid, visited, row, col)){
						countIsland++;
					}
				}
				
			}    
		}
		return 0;
    }
	
	public static boolean dfs(char[][] grid, boolean[][] visited, int row, int col){
		/*
			left = [row][col-1] 
			right = [row][col+1] 
			top = [row+1][col] 
			down = [row-1][col] 
		
		*/
		// left right traversal
		if(row < 0 || row >= grid.length) {
			return true;
		}
		// top bottom traversal
		if(col < 0 || col >= grid[0].length) {
			return true;
		}
		
		if(visited[row][col]) {
			System.out.println("Revisiting row " + row + " col : " + col);
			return false;
		}
		
		// visiting first time
		visited[row][col] = true;

		// base case
		if(grid[row][col] == '0') {
			return true;
		} 
		
		boolean is_right_valid = dfs(grid, visited, row+1, col);
		boolean is_left_valid = dfs(grid, visited, row-1, col);
		boolean is_top_valid = dfs(grid, visited, row, col+1);
		boolean is_down_valid = dfs(grid, visited, row, col -1);
		
		return is_right_valid && is_left_valid && is_top_valid && is_down_valid;
	}

}
