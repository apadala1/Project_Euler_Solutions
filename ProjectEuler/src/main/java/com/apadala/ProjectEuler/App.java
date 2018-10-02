package com.apadala.ProjectEuler;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		long lStartTime = System.nanoTime();
		System.out.println("----------P001---------------");
		P001.Solution();
		System.out.println("----------P002---------------");
		P002.Solution();
		System.out.println("----------P003---------------");
		P003.Solution();
		System.out.println(P003.Solution(600851475143L));
		
		/*-----------------------------------------------------*/
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println("\nElapsed time in milliseconds: " + output);
	}


}
