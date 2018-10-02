/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
public class P004 {
//	final static int NUM = 999;

	public static void Solution() {
		System.out.println(Solution(999));
	}

	/**
	 * 
	 * @param NUM
	 * @return
	 */
	public static int Solution(int NUM) {

		int res = 0, max = 0;
		for (int j = NUM; j > 100; j--) {
			for (int i = NUM; i > NUM - 200; i--) {

				if (Util.palindrome(i * j)) {

					res = i * j;
					if (res > max) {
						max = res;
					}

				}
			}

		}
		return max;
	}

}
