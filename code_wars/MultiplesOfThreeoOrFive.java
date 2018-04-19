package code_wars;

/*
 * adds every number that is either divisible by 3 or 5 up to the integer given in the argument to the method. 
 */

public class MultiplesOfThreeoOrFive {

	public static void main(String[] args) {
		MultiplesOfThreeoOrFive myMultiplesOfThreeoOrFive = new MultiplesOfThreeoOrFive();
		System.out.println(myMultiplesOfThreeoOrFive.solution(10));
	}

	public int solution(int number) {
		int result = 0;
		for(int i = 0; i <= number; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		return result;
	}
}