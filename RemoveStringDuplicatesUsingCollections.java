package Week3.day2.assignments.mandatory;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveStringDuplicatesUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		String text = "We learn java basics as part of java sessions in java week1";
		String[] strArray=text.split(" ");
		count=strArray.length;
		Set <String> strNoDuplicates= new LinkedHashSet<String>();
		System.out.println("The original string is:----> "+text);
		
		for(int i =0;i<count;i++) {
			strNoDuplicates.add(strArray[i]);
		}
		//Printing the string objects in the linkedhashset as string
		System.out.println("After removing duplicates using linkedhashset: ");
		System.out.println(strNoDuplicates);
		for (String str : strNoDuplicates) {
		    System.out.print(str + " ");
		}
		//StringBuilder stringBuild=new StringBuilder();		
	}

}
