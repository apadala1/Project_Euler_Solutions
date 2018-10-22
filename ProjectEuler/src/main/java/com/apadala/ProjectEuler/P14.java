/**
 * 
 */
package com.apadala.ProjectEuler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Akhileshwar.Padala
 *
 */

/*
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 It can be seen that this sequence
 * (starting at 13 and finishing at 1) contains 10 terms. Although it has not
 * been proved yet (Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class P14 implements PEuler {

	int cache(long num) {

		int count = 0;

		return count;
	}
	static int[] knownChains = new int[1000000];
	/*
	 * (non-Javadoc) Simple Brute force
	 * 
	 * @see com.apadala.ProjectEuler.PEuler#Solution()
	 */
	public String Solution() {
		long num = 1, count = 0, max = 0;
		int i;

		for (i = 1; i < 1000000; i++) {
			long temp = i;
			count = 0;
			while (temp > 1) {

				if (temp < 1000000 && knownChains[(int) temp] != 0) {
					count += knownChains[(int) temp];
					break;
				}

				if (temp % 2 == 0) {
					temp /= 2;
				} else {
					temp = 3 * temp + 1;
				}
				count++;

			}
			if (max < count) {
				num = i;
				max = count;

			}
			knownChains[i] = (int) count;
		}

		return Long.toString(num);
	}

}
