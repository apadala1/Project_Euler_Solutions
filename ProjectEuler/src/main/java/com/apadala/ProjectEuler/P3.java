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
public class P3 implements PEuler {

	public String Solution() {
		long n = 600851475143L, d = 0l;
		while (d < n) {
			d = Util.smallestFactor(n);
			n /= d;
		}
		return Long.toString(d);
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