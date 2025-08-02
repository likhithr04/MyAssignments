package week3.day1;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";

		// check given string is Anagrams are not
		if (!(text1.length() == text2.length())) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		} else {
			// convert strings to char Arrays
			char[] input1 = text1.toCharArray();
			char[] input2 = text2.toCharArray();
			Arrays.sort(input1); // sort
			Arrays.sort(input2);
			// compare sorted arrays
			if (Arrays.equals(input1, input2)) {
				System.out.println("The given strings are Anagram.");
			} else {
				System.out.println("The given strings are not  Anagram.");
			}
		}

	}

}
