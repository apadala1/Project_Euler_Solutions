/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
/*
 * | The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */
public class P10 implements PEuler {
	public static int tmillion = 2000000;
	public String Solution() {
		long sum = 2;
		for (int i = 3; i < tmillion; i = i + 2) {
			if (Util.isPrime(i)) {
				sum += i;
			}
		}
		return Long.toString(sum);
	}

}
