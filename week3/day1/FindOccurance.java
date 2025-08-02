package week3.day1;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "TestLeaf";
		int count = 0;
        // covert to char Array
		char[] a = input.toCharArray();
		for (int i = 0; i < input.length() - 1; i++) {
			if (a[i] == 'e') { // logic to iterate and compare no of occurrence of a particular character
				count++;
			}
		}
		System.out.println("no of occurance is " + count);// print final result
	}

}
