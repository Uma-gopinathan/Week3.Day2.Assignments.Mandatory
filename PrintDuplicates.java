package Week3.day2.assignments.mandatory;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
  public static void main(String[] args) {
	  int[] numbers =  {1,2,3,1,4,5,4};
	  boolean boolAdded;
	  Set <Integer> intHashSet = new LinkedHashSet<Integer>();
	  Set <Integer> intDuplicates=new LinkedHashSet<Integer>();
	  for(int i=0;i<numbers.length;i++) {
		  boolAdded = intHashSet.add(numbers[i]);
		  if (boolAdded==false) { //if the current value is duplicate, add to duplicate list based on boolean return val of add method
			  intDuplicates.add(numbers[i]);			  
		  }
	  }
	  System.out.println("The original Array is: "+Arrays.toString(numbers));
	  System.out.println("The duplicates in the Array are: "+intDuplicates);
  }
}
