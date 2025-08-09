package week4.day1.HomeAssignements;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		
        // declared two list 
		List<Integer> List1 = new ArrayList<>();
		List<Integer> List2 = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {//add array to list 
			List1.add(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
			List2.add(b[j]);
		}
		
       //compare list to get a match
		for (int i = 0; i < List1.size(); i++) {
			for (int j = 0; j < List2.size(); j++) {
				if (List1.get(i).equals(List2.get(j))) {// compare matching elements
					System.out.println("match found\n" + List1.get(i));
				}
			}
		}

	}
}
