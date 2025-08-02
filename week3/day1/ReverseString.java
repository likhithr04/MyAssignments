package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName = "TestLeaf";
		// convert to char array
		char[] input = companyName.toCharArray();
		System.out.println("reverse of given string");
		for (int i = input.length - 1; i >= 0; i--)// reverse string logic
		{
			System.out.print(input[i]);
		}
	}

}
