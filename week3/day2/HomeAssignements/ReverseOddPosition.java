package week3.day2.HomeAssignements;

public class ReverseOddPosition {
	    public static void main(String[] args) {
	        String test = "I am a software tester";

	        // Split the string into an array of words
	        String[] words = test.split(" ");

	        // Traverse the array
	        for (int i = 0; i < words.length; i++) {
	            // Step 3: Check for odd index (remember, index starts at 0)
	            if (i % 2 != 0) {
	                // Convert word to char array
	                char[] charArray = words[i].toCharArray();

	                // Reverse the char array using a loop
	                for (int j = charArray.length - 1; j >= 0; j--) {
	                    System.out.print(charArray[j]);
	                }
	            } else {
	                // If index is even, print word as is
	                System.out.print(words[i]);
	            }

	            // Add a space after each word
	            System.out.print(" ");
	        }
	    }
	}

