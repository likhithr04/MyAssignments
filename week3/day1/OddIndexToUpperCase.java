package week3.day1;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "changeme";
		char[] input = text.toCharArray(); //convert to char array
		for (int i=input.length-1; i >=0 ;i--) {
			if (i % 2 != 0) { // find odd index
				input[i] = Character.toUpperCase(input[i]);
			}
		}
		for (char c : input) {// print final result
			System.out.print(c);
		}
	}

}
