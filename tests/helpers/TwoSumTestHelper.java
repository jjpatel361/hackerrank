/**
 * 
 */
package helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Jay Patel
 *
 */
public class TwoSumTestHelper {
	
	
	public TwoSumTestHelper() {
		
	}
	
	public class TwoSumTestCase {
		
		public int[] data;
		public int target;
		public int[] result;
		
		public TwoSumTestCase(int[] data, int target, int[] result) {
			super();
			this.data = data;
			this.target = target;
			this.result = result;
		}
		
		
		
			
	}

	public List<TwoSumTestCase> loadTestCases(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		
		int no_of_testcases = Integer.parseInt(sc.nextLine().trim());
		List<TwoSumTestCase> testCases = new ArrayList<TwoSumTestCase>();
		
		for (int i = 0; i < no_of_testcases; i++) {
			
			String[] data = sc.nextLine().trim().split(",");
			
			int[] datapoints = Arrays.stream(data).mapToInt(Integer::parseInt).toArray();
			
			int target = Integer.parseInt(sc.nextLine().trim());
			
			String[] resultS = sc.nextLine().trim().split(",");
			int[] result = Arrays.stream(resultS).mapToInt(Integer::parseInt).toArray();
			
			TwoSumTestCase  ts = new TwoSumTestCase(datapoints, target, result);
			testCases.add(ts);
			
		}
		sc.close();	
		return testCases;
	}
	
}
