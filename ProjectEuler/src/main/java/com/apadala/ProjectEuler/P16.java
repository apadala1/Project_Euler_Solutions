/**
 * 
 */
package com.apadala.ProjectEuler;

import java.math.BigInteger;

/**
 * @author Akhileshwar.Padala
 *
 */
public class P16 implements PEuler {

	/*(non-Javadoc)**
	@see com.apadala.ProjectEuler.PEuler#Solution()
	 */
	public String Solution() {

		BigInteger b1 = new BigInteger("2");
		int exponent = 1000;

		String temp = b1.pow(exponent).toString();
		exponent = 0;
		for (int i = 0; i < temp.length(); i++) {
			exponent += temp.charAt(i) - '0';
		}
		return Integer.toString(exponent);
	}

}
