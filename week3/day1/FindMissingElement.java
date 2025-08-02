package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[]= {1,4,3,2,8,6,7};
		
		Arrays.sort(input);
		// logic to check if number is missing in array
		for(int i=0;i<input.length-1;i++)
		{
			if(input[i + 1] != input[i] + 1)
			{
				System.out.println("Missing Value is "+(input[i] + 1));
			}
		}

	}

}
