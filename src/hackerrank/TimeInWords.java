package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TimeInWords {
	
	
		public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("./data/timeinwords.txt"));
		int hours = sc.nextInt();
		int mins = sc.nextInt();
		sc.close();
		
		
		// Hours Dictionary
		HashMap<Integer, String> hoursMap = new HashMap<Integer, String>(12);
		hoursMap.put(1, "one");
		hoursMap.put(2, "two");
		hoursMap.put(3, "three");
		hoursMap.put(4, "four");
		hoursMap.put(5, "five");
		hoursMap.put(6, "six");
		hoursMap.put(7, "seven");
		hoursMap.put(8, "eight");
		hoursMap.put(9, "nine");
		hoursMap.put(10, "ten");
		hoursMap.put(11, "eleven");
		hoursMap.put(12, "twelve");
		
		//Minutes Dictionary
		HashMap<Integer, String> minutesMap = new HashMap<Integer, String>(61);
		
		minutesMap.put(1, "one minute");
		minutesMap.put(2, "two minutes");
		minutesMap.put(3, "three minutes");
		minutesMap.put(4, "four minutes");
		minutesMap.put(5, "five minutes");
		minutesMap.put(6, "six minutes");
		minutesMap.put(7, "seven minutes");
		minutesMap.put(8, "eigth minutes");
		minutesMap.put(9, "nine minutes");
		minutesMap.put(10, "ten minutes");
		minutesMap.put(11, "eleven minutes");
		minutesMap.put(12, "twelve minutes");
		minutesMap.put(13, "thirteen minutes");
		minutesMap.put(14, "fourteen minutes");
		minutesMap.put(15, "quarter past");
		minutesMap.put(16, "sixteen minutes");
		minutesMap.put(17, "seventeen minutes");
		minutesMap.put(18, "eighteen minutes");
		minutesMap.put(19, "nineteen minutes");
		minutesMap.put(20, "twenty minutes");
		minutesMap.put(21, "twenty one minutes");
		minutesMap.put(22, "twenty two minutes");
		minutesMap.put(23, "twenty three minutes");
		minutesMap.put(24, "twenty four minutes");
		minutesMap.put(25, "twenty five minutes");
		minutesMap.put(26, "twenty six minutes");
		minutesMap.put(27, "twenty seven minutes");
		minutesMap.put(28, "twenty eight minutes");
		minutesMap.put(29, "twenty nine minutes");
		minutesMap.put(30, "half past");
		minutesMap.put(31, "twenty nine minutes");
		minutesMap.put(32, "twenty eight minutes");
		minutesMap.put(33, "twenty seven minutes");
		minutesMap.put(34, "twenty six minutes");
		minutesMap.put(35, "twenty five minutes");
		minutesMap.put(36, "twenty four minutes");
		minutesMap.put(37, "twenty three minutes");
		minutesMap.put(38, "twenty two minutes");
		minutesMap.put(39, "twenty one minutes");
		minutesMap.put(40, "twenty minutes");
		
		minutesMap.put(41, "nineteen minutes");
		
		minutesMap.put(42, "eighteen minutes");
		minutesMap.put(43, "seventeen minutes");
		minutesMap.put(44, "sixteen minutes");
		minutesMap.put(45, "quarter");
		minutesMap.put(46, "fourteen minutes");
		minutesMap.put(47, "thirteen minutes");
		minutesMap.put(48, "twelve minutes");
		minutesMap.put(49, "eleven minutes");
		
		minutesMap.put(50, "ten minutes");
		
		minutesMap.put(51, "nine minutes");
		minutesMap.put(52, "eight minutes");
		minutesMap.put(53, "seven minutes");
		minutesMap.put(54, "six minutes");
		minutesMap.put(55, "five minutes");
		minutesMap.put(56, "four minutes");
		minutesMap.put(57, "three minutes");
		minutesMap.put(58, "two minutes");
		minutesMap.put(59, "nine minutes");
		
		String result = "";
		if(mins == 0){
			result = hoursMap.get(hours) + " o' clock";
		}else if(mins < 15){
			result = minutesMap.get(mins)+ " past " + hoursMap.get(hours);
			
		}else if(mins == 15 || mins == 30) {
			result = minutesMap.get(mins)+ " " + hoursMap.get(hours);
			
		}else if( 15 < mins && mins < 30){
			result = minutesMap.get(mins)+ " past " + hoursMap.get(hours);
		}
		else if(mins > 30 ) {
			result = minutesMap.get(mins)+ " to " + hoursMap.get(hours +1);
			
		}
		System.out.println(result);
		
	}

}
