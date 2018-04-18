package prime_numbers;

/*This class runs the prime number counter - and will output how many prime numbers
 * there are between 1 and the argument given - for instance, there are 25 prime numbers
 * between 1 and 100. 
*/

public class Runner {
	
	public static void main(String[] args) {
		CountPrimes myCountPrimes = new CountPrimes();
		myCountPrimes.countPrimes(100);
	}
}