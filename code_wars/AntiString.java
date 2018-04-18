package code_wars;

import java.util.Arrays;
import java.util.List;

/*
 * This class takes a string containing integers from 1 to 9 and chars from a to z. 
 * It changes numbers to their opposite - i.e. 0 becomes 9, 1 becomes 8, 2 becomes 7. 
 * It does a similar thing to chars - a becomes z, b becomes y etc. Chars also change case, 
 * sp uppercase chars become lowercase and vice versa. The whole string is also reversed. 
 */

public class AntiString {

	List<Character> myChars = Arrays.asList(new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'});
	int[] myInts = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	
	StringBuilder myStringBuilder = new StringBuilder();
	
	public static void main(String[] args) {
		AntiString myAntiString = new AntiString();
		myAntiString.antiString("Ab345");
	}

	public String antiString(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				char charToAppend = myChars.get(25 - myChars.indexOf(Character.toLowerCase(str.charAt(i))));
				if (Character.isUpperCase(str.charAt(i))) {
					charToAppend = Character.toLowerCase(charToAppend);
				} else {
					charToAppend = Character.toUpperCase(charToAppend);
				}
				myStringBuilder.append(charToAppend);
			} else {
				int intFromString = Character.getNumericValue(str.charAt(i));
				int intToAppend = Math.abs(intFromString -9);
				myStringBuilder.append(intToAppend);
			}
		}
		myStringBuilder.reverse();
		System.out.println(myStringBuilder.toString());
		return myStringBuilder.toString();
	}
}