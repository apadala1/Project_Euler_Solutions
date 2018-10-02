/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */
public class P003 {

	public static void Solution() {
		long n = 600851475143L, d = 0l;
		while (d < n) {
			d = smallestFactor(n);
			n /= d;
		}
		System.out.println(d);
	}

	private static long smallestFactor(long n) {
		int limit = (int) Math.sqrt(n);
		for (long i = 2; i <= limit; i++) {
			if (n % i == 0)
				return i;
		}
		return n;
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	public static int Solution(Long number) {
		int result = 0;
		while (number != 1) {
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					number = number / i;
					if (result < i) {
						result = i;
					}
					break;
				}
			}
		}
		return result;
	}

}