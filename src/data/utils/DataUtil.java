package data.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class DataUtil {

	public ArrayList<Integer> readFile(String filePath) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		ArrayList<Integer> data = new ArrayList<Integer>();
		try {
		    String line = br.readLine();
		    while (line != null) {
		    	int d = Integer.parseInt(line);
		    	data.add(d);
		        line = br.readLine();
		    }
		    
		} finally {
		    br.close();
		}
		return data;
	}
	
	public static ArrayList<Integer> generateRandomData(int size, int upperBound) {
		Random rand  = new Random();
		ArrayList<Integer> data = new ArrayList<>();  
		for (int i = 0; i < size; i++) {
			int r = rand.nextInt(upperBound);
			data.add(r);
		}
		return data;
	}

	public void saveResult(ArrayList<Integer> sortedData, String file_name) throws IOException {
		BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter(file_name));
		  for (int i = 0; i < sortedData.size(); i++) {
		    // Maybe:
		    outputWriter.write(sortedData.get(i)+"");
		    outputWriter.newLine();
		  }
		  outputWriter.flush();  
		  outputWriter.close();  
	}
}
