package code_wars;

import java.util.Arrays;

/*
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 */

public class FindTheOddInt {

	public static void main(String[] args) {
		FindTheOddInt myFindTheOddInt = new FindTheOddInt();
		System.out.println(myFindTheOddInt.findInt(new int[] { 1,2,1,3,2 }));
	}

	public String findInt2(int[] A) {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(A);
		for (int thisNumber : A) {
			sb.append(thisNumber);
		}
		return sb.toString();
	}

	public int findInt(int[] A) {
		int myCounter = 0;
		Arrays.sort(A);
		int currentNumber = A[0];
		for (int i = 0; i < A.length; i++) {
			if (currentNumber == A[i]) {
				myCounter++;
			}
			if ((i >= A.length -1 || currentNumber != A[i + 1] ) && myCounter > 0 && myCounter % 2 != 0) {
				return currentNumber;
			} else if(currentNumber != A[i + 1]) {
				myCounter = 0;
				currentNumber = A[i + 1];
			}
		} return -1;
	}
}