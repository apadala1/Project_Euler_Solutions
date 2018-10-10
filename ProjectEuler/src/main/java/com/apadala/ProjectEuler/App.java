package com.apadala.ProjectEuler;

/**
 * Hello world!
 *
 */
public class App {

	static int n = 764;
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

				long lEndTime = System.nanoTime();
				long output = lEndTime - lStartTime;
				System.out.println("\nElapsed time in sec: "
						+ (double) output / 1000000000);
				System.exit(0);

			}

		}

	}
}
