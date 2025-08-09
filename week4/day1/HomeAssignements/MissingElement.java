package week4.day1.HomeAssignements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> List = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {// add array to list
			List.add(array[i]);
		}
		// Sort the list
		Collections.sort(List);
		System.out.println(List);
		 // Find missing elements
			for (int i = 0; i < List.size() - 1; i++) {
				if (List.get(i + 1) - List.get(i) > 1) {
					{
						for (int missing = List.get(i) + 1; missing < List.get(i + 1); missing++) {
							System.out.println("missing ele is " + missing);
						}
					}

				}
			}
		}
	}
