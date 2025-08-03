package week3.day2.HomeAssignements;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "Java is easy to learn and Java is powerful";

		// Initialize count for duplicates
		int count = 0;

		// Split string into words by space
		String[] words = text.split(" ");

		// Compare each word with every other word
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				// If duplicate found and word is not already replaced
				if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
					words[j] = ""; // Remove duplicate
					count++;
				}
			}
		}

		// Print result if duplicates found
		if (count > 0) {
			System.out.println("Modified words array (duplicates removed):");
			for (String word : words) {
				if (!word.equals("")) {
					System.out.print(word + " ");
				}
			}
		} else {
			System.out.println("No duplicate words found.");
		}
	}

}
