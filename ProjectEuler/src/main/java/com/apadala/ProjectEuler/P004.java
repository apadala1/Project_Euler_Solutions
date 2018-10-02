/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
/*
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P004 {
	// final static int NUM = 999;

	public static void Solution() {
		System.out.println(Solution(999));
	}

	/**
	 * 
	 * @param NUM
	 * @return
	 */
	public static int Solution(int NUM) {

		int max = 0;
		for (int j = NUM; j > 100; j--) {
			for (int i = NUM; i > NUM - 200; i--) {
				if (i * j < max)
					break;
				if (Util.palindrome(i * j) && i * j > max) {

					max = i * j;
				}

			}

		}
		return max;
	}

}
