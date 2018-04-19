package code_wars;

/*
 * Takes an integer array and returns the position at which the total of the integers to the left and right
 * add up to the same figure. Returns -1 if there is no point at which the both side equal the same figure. 
 */

public class EqualSidesOfAnArray {

	public static void main(String[] args) {
		EqualSidesOfAnArray myESOA = new EqualSidesOfAnArray();
		int[] myIntArray = { 7, 4, 2, 1, 2, 1, 10 };
		System.out.println(myESOA.findEvenIndex(myIntArray));
	}

	public int findEvenIndex(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int leftCounter = 0;
			int rightCounter = 0;
			for (int j = 0; j < i; j++) {
				leftCounter += arr[j];
			}
			for (int j = i + 1; j < arr.length; j++) {
				rightCounter += arr[j];
			}
			if (leftCounter == rightCounter) {
				return i;
			}
		}
		return -1;
	}
}