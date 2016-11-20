public class LetterFreq {
	public static int[] getFreqs(String[] doc) {

		int[] retInt = new int[26];
		for (int i = 0; i < retInt.length; i++)
			retInt[i] = 0;

		for (String line : doc) {
			char[] lineInArray = line.toLowerCase().toCharArray();
			for (char charInLine : lineInArray) {
				if (Character.isAlphabetic(charInLine)) {
					int charAsInt = (int) charInLine - 97;
					retInt[charAsInt]++;
				}
			}
		}
		return retInt;
	}
}