package morse_code;

import java.util.HashMap;

/*
 * This class translates morse code into English - the code to be translated can be amended. 
 */

public class MorseCode {

	public static void main(String[] args) {

		HashMap<String, Character> map = new HashMap<>();

		map.put(".-", 'a');
		map.put("-...", 'b');
		map.put("-.-.", 'c');
		map.put("-..", 'd');
		map.put(".", 'e');
		map.put("..-.", 'f');
		map.put("--.", 'g');
		map.put("....", 'h');
		map.put("..", 'i');
		map.put(".---", 'j');
		map.put("-.-", 'k');
		map.put(".-..", 'l');
		map.put("--", 'm');
		map.put("-.", 'n');
		map.put("---", 'o');
		map.put(".--.", 'p');
		map.put("--.-", 'q');
		map.put(".-.", 'r');
		map.put("...", 's');
		map.put("-", 't');
		map.put("..-", 'u');
		map.put("...-", 'v');
		map.put(".--", 'w');
		map.put("-..-", 'x');
		map.put("-.--", 'y');
		map.put("--..", 'z');  

		String codeToBeTranslated = ".-- --- .--  - .... .. ...  .. ...  ... --- -- .  .-- . .-.. .-..  .-- .-. .. - - . -.  -.-. --- -.. . ";

		String[] arrayOfCodeToBeTranslatedSplit = codeToBeTranslated.split("  ");
		StringBuilder codeConvertedToEnglish = new StringBuilder();

		for (int j = 0; j < arrayOfCodeToBeTranslatedSplit.length; j++) {
			String individualWordString = arrayOfCodeToBeTranslatedSplit[j];
			String[] myIndividualLettersArrayList = individualWordString.split(" ");
			codeConvertedToEnglish.append(" ");
			for (int i = 0; i < myIndividualLettersArrayList.length; i++) {
				codeConvertedToEnglish.append(map.get(myIndividualLettersArrayList[i]));
			}
		}
		System.out.println("Original morse code: " + codeToBeTranslated);
		System.out.println("Converted to English: " + codeConvertedToEnglish);
	}
}