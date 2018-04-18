package prime_numbers;

public class CountPrimes {

	private int counter = 0;

	public void countPrimes(int finish) {
		PrimeTest myPrimeTest = new PrimeTest();
		for (int i = 2; i <= finish; i++) {
			if (myPrimeTest.testIfPrime(i) == true) {
				counter += 1;
			}
		}
		System.out.println(counter);
	}
}