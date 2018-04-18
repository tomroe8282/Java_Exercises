package prime_numbers;

public class PrimeTest {
	public Boolean testIfPrime(double number) {
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}

		int i = 3;
		double sqrtOfNumber = Math.sqrt(number);

		while (i <= sqrtOfNumber) {
			if (number % i == 0) {
				return false;
			}
			i += 2;
		}
		return true;
	}
}