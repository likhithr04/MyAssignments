package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		boolean isPrimeNo = true;

		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				isPrimeNo = false;
				break;
			}
		}
		if (isPrimeNo) {
			System.out.println(n + " is prime number");
		}
		else {
		System.out.println(n + " is not prime no");
		}
	}
}
