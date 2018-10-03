/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
/*
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
 * numbers is,
 * 
 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is 3025 −
 * 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
public class P006 {
	public static void Solution() {
		System.out.println(Solution(100));
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	static long Solution(int n) {

		return Util.square(((n * (n + 1)) / 2))
				- ((n * (n + 1) * ((2 * n) + 1)) / 6);
	}

}
