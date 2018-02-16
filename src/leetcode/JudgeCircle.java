package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class JudgeCircle {

	public static boolean judgeCircle(String moves) {
		// 0 - L , 1 - R , 2 - U, 3 - D
		int[] ct = new int[4];
		
		for(char c : moves.toCharArray()) {
			switch (c) {
			case 'L':
				ct[0] += 1;
				break;
			case 'R':
				ct[1] += 1;
				break;
			case 'U':
				ct[2] += 1;
				break;
			case 'D':
				ct[3] += 1;
				break;
			default:
				break;
			}
		}
		
		return (ct[0] == ct[1] && ct[2] == ct[3]);
	}
}
