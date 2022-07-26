package Week3.day2.assignments.mandatory;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
public class FindNumberOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers =  {2,3,5,6,3,2,1,4,2,1,6,-1};
		boolean boolAddedOrNot;
		Set<Integer> treeSet1= new TreeSet<Integer>();
		Set<Integer> treeSetDuplicates= new TreeSet<Integer>();
		Map<Integer,Integer> map1= new LinkedHashMap<Integer,Integer>();   //map to store occurences of all the numbers
		Map<Integer,Integer> map2= new LinkedHashMap<Integer,Integer>();  //map to store only more than once occurring character

		//for loop to iterate through the array and store the values in separate treesets for duplicate values
		for(int i = 0;i<numbers.length;i++) {
			boolAddedOrNot = treeSet1.add(numbers[i]);
			if(!boolAddedOrNot) { //if the no. is not added to the treeset boolean value will be false, then add it to duplicates list
				treeSetDuplicates.add(numbers[i]);
			}
			map1.put(numbers[i], map1.getOrDefault(numbers[i], 0)+1); //storing the key value pair
		}		

		System.out.println("The original array with duplicates: " +Arrays.toString(numbers));
		System.out.println("The duplicates numbers are: ");
		System.out.println(treeSetDuplicates);
		System.out.println("The no. of occurences of all the numbers: ");
		System.out.println(map1);

		//for loop to put into map2- more than once occurring characters
		for (Map.Entry<Integer, Integer> entry: map1.entrySet())
		{ 
			if (entry.getValue()>1) {
				map2.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println("The no. of occurences of the repeating numbers: ");
		System.out.println(map2);
	}
}
