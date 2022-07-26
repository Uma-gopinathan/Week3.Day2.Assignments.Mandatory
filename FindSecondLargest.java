package Week3.day2.assignments.mandatory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] numbers= {3,2,11,4,6,7};
     int length = numbers.length;
    // Arrays.sort(numbers);
     ArrayList<Integer> arrList1 = new ArrayList<Integer>(); //arraylist - class
     List<Integer> arrList2= new ArrayList<Integer>();   //list - iterface(cant be instantiated)
     TreeSet<Integer> tree1 =new TreeSet<Integer>();
     for(int i=0;i<length;i++) {	     
	     arrList1.add(numbers[i]);	    
	     arrList2.add(numbers[i]);
	     tree1.add(numbers[i]); //no need to sort the treeset as it order as per natural sequence of numbers
	}
     for (Integer val : arrList1)
     { 		      
          System.out.print(val + " "); 		
     }

    // Arrays.sort(arrList1);
     Collections.sort(arrList1);
     Collections.sort(arrList2);
     System.out.println("The second largest number is: ");
     System.out.println(arrList1.get(length-1)); 
     //System.out.println(Collections.max(arrList2));
     System.out.println(arrList2.get(length-1));
    // System.out.println(tree1);
     Object[] array = tree1.toArray();
     System.out.println(array[length-1]);
     
	}
}
