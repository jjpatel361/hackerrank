package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;



public class SherlockString {

	/*
	 * 	@description : https://www.hackerrank.com/challenges/sherlock-and-valid-string
	 * */
	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner sc  = new Scanner(new File("./data/sherlockstring.txt"));
		
		String data = sc.next();
		
		sc.close();
		
		char[] code = data.toCharArray();
		//System.out.println(isStringValid(code));
		System.out.println(isValid(data)); 
	}
	
private static String isValid(String data) {
	
		char[] code = data.toCharArray();
		// If there is just two characters in array return true
		if(code.length <= 2) {
			return "YES";
		}
		
		//create letter to frequency hash map
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(code.length);
		 
		for(int i = 0; i < code.length; i++) {
			if(map.containsKey(code[i])) {
				int count = map.get(code[i]) + 1;
				map.put(code[i], count);
			}else {
				map.put(code[i], 1);
			}
		}
		
		// flatten values of hash map to single sorted array
		Integer[] vals = map.values().toArray(new Integer[0]);
		
		Arrays.sort(vals);
		
		// create array of array with frequency
		
		HashMap<Integer, ArrayList<Integer>> freq_map = new HashMap<>();; 
		for (int i = 0; i < vals.length; i++) {
			if(freq_map.containsKey(vals[i])){
				ArrayList<Integer> d = freq_map.get(vals[i]);
				d.add(vals[i]);
			}else {
				ArrayList<Integer> tmp = new ArrayList<>();
				tmp.add(vals[i]);
				freq_map.put(vals[i], tmp);
			}
		}
		Collection<ArrayList<Integer>> flatten_map = freq_map.values();
		
		/*
		 * Anything greater than 2 values in hash map is sure reject
		 * [[1], [3,3]]
		 * */
		if(flatten_map.size() > 2) {
			return "NO";
		}
		
		/* If there are 2 elements one element has to of size 
		 * 1 and other n-1
		 * 
		 * Since there are just two elements you can get via iterator
		 * */
		Iterator it = flatten_map.iterator();
		ArrayList<Integer> primary = (ArrayList<Integer>) it.next();
		if(!it.hasNext()) {
			// if only primary freq exists meaning just one single freq hence exit
			return "YES";
		}
		ArrayList<Integer> secondary = (ArrayList<Integer>) it.next();
		
		
		/*
		 * Keep the bigger freq as secondary always
		 * */
		if(primary.size() > secondary.size()) {
			ArrayList<Integer> p = primary;
			primary = secondary;
			secondary = p;
		}
		
		
		/*
		 * [1,1] [3,3]
		 * 
		 * */
		if(primary.size() == secondary.size()) {
			return "NO";
		}
		
		/* 
		 * [1] [2,2] // 1
		 * [4] [3,3] // 1
		 * [2] [3,3] // -1
		 * [5]  [4,4]
		 * */
		if(primary.size() == 1 && secondary.size() == vals.length - 1) {
			Integer pr = primary.get(0);
			Integer sec = secondary.get(0);
			if(pr == 1) {
				return "YES";
			}
			if(pr - sec == 1) {
				return "YES";
			}
		}
		
		return "NO";
		
}

private static boolean isStringValid(final char[] S){
        
        //If string contains less than two letters
        if(S.length < 2){
            return true;
        }
        
        //Create histogram of letters
        final int[] L = new int[26];
        for(int i = 0, N = S.length; i < N; ++L[S[i++] - 'a']){
        	
        }
        
        //Sort the histogram
        Arrays.sort(L);
        
        //Ignore unseen letters
        int i;
        for(i = 0; i < 26 && L[i] == 0; ++i){
        	
        }
        
        //If all letter frequencies are equal
        if(L[i] == L[25]){
            return true;
        }
        
        //If there's one letter above the rest by one
        if(L[25] > L[24]){
            return L[i] == L[24] && L[25] - L[24] == 1;
        }
        
        //If there's one letter below the rest by one or that can be removed
        return L[i] < L[i+1] && L[i+1] == L[25] && L[i] == 1;
    }

}
