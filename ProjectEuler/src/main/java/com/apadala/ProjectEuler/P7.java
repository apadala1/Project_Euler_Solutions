/**
 * 
 */
package com.apadala.ProjectEuler;

import java.util.ArrayList;

/**
 * @author Akhileshwar.Padala
 *
 */
/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 */
public class P7 implements PEuler {
	public String Solution() {
		return Long.toString(Solution(10001));
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	static long Solution(int n) {
		ArrayList<Long> l = new ArrayList<Long>();
		int i = 2;
		l.add((long) 2);
		while (l.size() < n) {
			if (Util.isPrime(i))
				l.add((long) i);
			i++;

		}

		return l.get(n - 1);

	}

}
