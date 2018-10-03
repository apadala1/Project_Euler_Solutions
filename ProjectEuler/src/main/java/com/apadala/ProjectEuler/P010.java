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
public class P010 {
	public static int tmillion = 2000000;
	public static void Solution() {
		long sum = 2;
		for (int i = 3; i < tmillion; i = i + 2) {
			if (Util.isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
