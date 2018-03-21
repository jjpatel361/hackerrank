package leetcode;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;

public class FindDuplicateFileInSystem {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		
		HashMap<String, ArrayList<String>> content_directory_mapping = new HashMap<String, ArrayList<String>>();
		ArrayList<String> p = new ArrayList<>();
		p.add("SuperPower");
		content_directory_mapping.put("2018", p);
		
		boolean isAdded = content_directory_mapping.computeIfAbsent("2018", v -> new ArrayList<String>()).add("Jay");
	
		if (!isAdded){
			System.out.println("Alread Present so adding new element..");
			content_directory_mapping.computeIfPresent("2018", (k, v) -> v).add("Patel");
		}else {
			System.out.println("No element found added a new one.");
		}
		
		
		
	}

	public static List<List<String>> findDuplicate(String[] paths) {

		
		HashMap<String, ArrayList<String>> content_directory_mapping = new HashMap<String, ArrayList<String>>();
		for(String data : paths) {
			String[] splits = data.split(" ");
			String dir = splits[0];
			for (int i = 1; i < splits.length; i++) {
				//
				String dir_content = splits[i];
				String content = dir_content.substring(dir_content.indexOf("(") + 1 , dir_content.indexOf(")"));
				String file_name = dir_content.substring(0, dir_content.indexOf("("));
				System.out.println("dir :" + dir + " content : " + content + " file_name : " + file_name );
				
				if(content_directory_mapping.containsKey(content)) {
					content_directory_mapping.get(content).add(dir + "/" + file_name);
				}else {
					ArrayList<String> directories = new ArrayList<String>();
					directories.add(dir+ "/" + file_name);					
					content_directory_mapping.put(content, directories );					
				}
				
//				content_directory_mapping.computeIfPresent(content, (k, v) -> v)
//				.add(dir + "/" + file_name);
				
				
			}
		}
		
		// iterate through hash map 
		List<List<String>> d = content_directory_mapping
			.entrySet()
			.stream()
			.filter(e -> e.getValue().size() > 1)
			.map(e -> e.getValue()).collect(Collectors.toList());
		
		
		return d;
	}

}
