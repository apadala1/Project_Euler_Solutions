/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */
public class P5 implements PEuler {
	/**
	 * @return
	 * 
	 */
	public String Solution() {
		int j = 2;
		for (int i = 20;; i += 2) {
			for (j = 2; j < 21; j++) {
				if (i % j != 0) {
					break;
				}
			}

			if (j == 21) {
				return Integer.toString(i);

			}
		}
	}
}
