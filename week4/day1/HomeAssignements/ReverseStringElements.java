package week4.day1.HomeAssignements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] MNC = { "HCL", "Wipro", "Aspire Systems", "CTS" }; // Array declaration
		List<String> List = new ArrayList<>();
		for (String company : MNC) { // company will hold each value from MNC
			List.add(company);
		}

		Collections.sort(List);// sorting list
		System.out.println(List);
		System.out.println("Reverse");
		//reverse loop
		for (int i = List.size() - 1; i >= 0; i--) {
			System.out.println(List.get(i));
		}

	}

}
