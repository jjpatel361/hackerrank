package models;

import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapSum {
	
	HashMap<String, Integer> _map; 
    /** Initialize your data structure here. */
    public MapSum() {
        _map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        _map.put(key, val);
    }
    
    public int sum(String prefix) {
//    	int count = _map.keySet().stream().filter(key -> key.startsWith(prefix))
//    	.map(str -> _map.get(str)).mapToInt(Number::intValue).sum();
    	
    	java.util.List<String> valid_keys = _map.keySet().stream().filter(key -> key.startsWith(prefix)).collect(Collectors.toList());
    	int ct = 0;
    	for (String str : valid_keys) {
			ct += _map.get(str);
		}
        return ct;
    }
}