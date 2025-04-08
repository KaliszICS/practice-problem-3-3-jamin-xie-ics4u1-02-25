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
		if (unusedLetters.isEmpty()) {
			permutations.add(usedLetters);
			return;
		}

		for (int i = 0; i < unusedLetters.length(); i++) {
			permHelper(usedLetters + unusedLetters.charAt(i), unusedLetters.substring(0, i) + unusedLetters.substring(i + 1), permutations);
		}
	}

	public static ArrayList<String> permsUnique(String word) {

		ArrayList<String> permu = new ArrayList<String>();

		permUniqueHelper("", word, permu);
		return permu;
	}
	
	public static void permUniqueHelper(String usedLetters, String unusedLetters, ArrayList<String> permu) {
		if(unusedLetters.isEmpty()){
			if(!(permu.contains(usedLetters))){
				permu.add(usedLetters);
				return;
			} 
			return;
		}
		for(int i = 0; i < unusedLetters.length(); i++){
			permUniqueHelper(usedLetters + unusedLetters.charAt(i), unusedLetters.substring(0,i) + unusedLetters.substring(i+1), permu);
		}
	}
}
