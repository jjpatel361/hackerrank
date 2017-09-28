package leetcode;

import models.MapSum;

public class MapSumImpl {

	public static void main(String[] args) {
		MapSum mp = new MapSum();
		mp.insert("apple", 3);
		System.out.println(mp.sum("app"));
		mp.insert("app", 2);
		System.out.println(mp.sum("app"));
		
	}

}
