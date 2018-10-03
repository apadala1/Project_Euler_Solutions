/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which,
 * 
 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 */
public class P009 {
	/*
	 * heard coded brute force
	 */
	public static void Solution() {
		int k = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = i + 1; j < 1000; j++) {
				k = 1000 - i - j;
				if (i + j + k == 1000) {
					if (i * i + j * j == k * k)

						System.out.println(i * j * k);

				}

			}
		}
	}
}
