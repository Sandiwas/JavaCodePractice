package nov;

public class C2CheckPrimeNumber {
	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		if (isPrime(3)) {
			System.out.println("Given number is prime number");
		} else {
			System.out.println("Givcen number is not prime number");
		}
	}
}
