package Week3.day2.assignments.mandatory;
import java.util.*;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1,2,3,4,7,6,8};

		ArrayList<Integer> arr2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		//Collections.sort(arr2); - not required as we are using contains method to check the match
		System.out.println(arr2);
		for(int i =1;i<arr2.size();i++) {
			if (!arr2.contains(i)&&i!=0) {
				System.out.println("The iterator var: "+ i + " is not present in the array");
				break;
			}
		}
	}


}

