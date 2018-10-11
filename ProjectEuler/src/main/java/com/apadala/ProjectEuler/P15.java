/**
 * 
 */
package com.apadala.ProjectEuler;

/**
 * @author Akhileshwar.Padala
 *
 */
public class P15 implements PEuler {

	/*
	 * N*n grid can be done in 2Nbinomial coefficient of N
	 * 
	 * @see com.apadala.ProjectEuler.PEuler#Solution()
	 */

	public String Solution() {

		return Util.binomialCoefficient(40, 20).toString();
	}

}
