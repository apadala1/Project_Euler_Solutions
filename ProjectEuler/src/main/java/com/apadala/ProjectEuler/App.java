package com.apadala.ProjectEuler;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		long lStartTime = System.nanoTime();
		System.out.println("-----------------------------");
		P001.Solution();
		System.out.println("-----------------------------");
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println("\nElapsed time in milliseconds: " + output);
	}
}
 