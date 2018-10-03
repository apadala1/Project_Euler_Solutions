package com.apadala.ProjectEuler;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		long lStartTime = System.nanoTime();
		/*
		 * System.out.println("----------P001---------------"); P001.Solution();
		 * System.out.println("----------P002---------------"); P002.Solution();
		 * System.out.println("----------P003---------------"); P003.Solution();
		 * System.out.println(P003.Solution(600851475143L));
		 * System.out.println("----------P004---------------"); P004.Solution();
		 * System.out.println("----------P005---------------"); P005.Solution();
		 * System.out.println("----------P006---------------"); P006.Solution();
		 * System.out.println("----------P007---------------"); P007.Solution();
		 * System.out.println("----------P008---------------"); P008.Solution();
		 * System.out.println("----------P009---------------"); P009.Solution();
		 */
		System.out.println("----------P010---------------");
		P010.Solution();

		/*-----------------------------------------------------*/
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println(
				"\nElapsed time in sec: " + (double) output / 1000000000);
	}

}
