package com.apadala.ProjectEuler;

/**
 * Hello world!
 *
 */
public class App {

	static int n = 12;
	public static void main(String[] args) {
		long lStartTime = System.nanoTime();

		@SuppressWarnings("rawtypes")
		Class cls = null;

		for (int i = 1; i <= n; i++) {

			String className = "P" + i;

			String fullPathOfTheClass = "com.apadala.ProjectEuler." + className;
			System.out.println("----------" + className + "---------------");
			try {

				cls = Class.forName(fullPathOfTheClass);
				PEuler myTestObject = (PEuler) cls.newInstance();
				System.out.println(myTestObject.Solution());
			} catch (Exception e) {
				System.out.println("No solution for project =" + e);
			}

		}

		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println(
				"\nElapsed time in sec: " + (double) output / 1000000000);
	}

}
