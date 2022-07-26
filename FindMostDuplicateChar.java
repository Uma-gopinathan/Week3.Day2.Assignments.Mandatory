package Week3.day2.assignments.mandatory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateChar {

	public static <K> void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "abbaba";
		String text = "conccoction";
		char[] chArray = text.toCharArray();
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		for(int i =0;i<chArray.length;i++) {
			map1.put(chArray[i], map1.getOrDefault(chArray[i], 0)+1);    	
		}
		//print the map with key value pair of character=no. of occurences
		System.out.println(map1);
		int maxValueInMap = (Collections.max(map1.values()));
		System.out.println("The character with the most occurences in the string: " +text);
		//iterating through the array to find the key with the maximum repetition-maxValueInMap(var)
		for (Map.Entry<Character, Integer> entry: map1.entrySet())
        { 
            if (entry.getValue()==maxValueInMap) {
            	System.out.println(entry.getKey() + " - with: "+ maxValueInMap+" occurences");
            }
        }

	}

}
