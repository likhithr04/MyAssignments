package week4.day1.HomeAssignements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 3, 2, 11, 4, 6, 7 }; // Array declaration
		List<Integer> List = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {// add array to list
			List.add(a[i]);
		}
		Collections.sort(List);// sorting list 
		//print list 
		System.out.println("List after sorting\n" + List);
		System.out.println("Second Largest Element in List\n"+ List.get(4));
	}

}
