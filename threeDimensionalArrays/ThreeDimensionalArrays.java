package threeDimensionalArrays;

/*
 * Set up a 3D array and make a selection
 */

public class ThreeDimensionalArrays {

	public static void main(String[] args) {
		ThreeDimensionalArrays myThreeDimensionalArrays = new ThreeDimensionalArrays();
		System.out.println(myThreeDimensionalArrays.setUpArray());
	}

	public String setUpArray() {
		int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 }, };
		return("The output is: " + myArray[1][3]);
	}
}