import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static ArrayList<String> perms(String word) {

		ArrayList<String> permutations = new ArrayList<String>();

		permHelper("", word, permutations);
		return permutations;
	}

	public static void permHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations) {
		if (usedLetters.isEmpty()) {
			permutations.add(usedLetters);
			return;
		}

		for (int i = 0; i < usedLetters.length(); i++) {
			permHelper(usedLetters + usedLetters.charAt(i), unusedLetters.substring(0, i) + usedLetters.substring(i + 1), permutations);
		}
	}

	public static ArrayList<String> permUnique(String word) {

		ArrayList<String> permutations = new ArrayList<String>();

		permUniqueHelper("", word, permutations);
		return permutations;
	}

	public static void permUniqueHelper(String usedLetters, String unusedLetters, ArrayList<String> permutations) {
		if (usedLetters.isEmpty()) {
			if (!(permutations.contains(usedLetters))) {
				permutations.add(unusedLetters);
				return;
			}
			return;
		}

		for (int i = 0; i < usedLetters.length(); i++) {
			permUniqueHelper(usedLetters + usedLetters.charAt(i), unusedLetters.substring(0, i) + usedLetters.substring(i+1), permutations);
		}
	}
}
