/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
public class Util {
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean palindrome(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Primes are positive");
		}
		int rev = 0, temp = n, sum = 0;
		while (temp > 0) {
			rev = temp % 10;
			sum = (sum * 10) + rev;
			temp /= 10;

		}
		if (sum == n)
			return true;
		return false;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static long smallestFactor(long n) {
		if (n < 0) {
			throw new IllegalArgumentException("Primes are positive");
		}
		int limit = (int) Math.sqrt(n);
		for (long i = 2; i <= limit; i++) {
			if (n % i == 0)
				return i;
		}
		return n;
	}

	/**
	 * @param i
	 * @return
	 */
	public static long square(long i) {
		// TODO Auto-generated method stub

		return i * i;
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(long n) {
		if (n < 0) {
			throw new IllegalArgumentException("Primes are positive");
		}
		if (n < 2)
			return false;
		if (n < 4)
			return true;

		if (n % 2 == 0)
			return false;
		if (n % 3 == 0)
			return false;
		if (n < 9)
			return true;

		for (long i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;

	}
}
