package com.lambda.classinclass.task04;

public class MathUtils {

	static class Factor {

		long calculate(int n) {

			long res = 1;
			for (int i = 1; i <= n; i++) {
				res =res*i;
			}

			return res;
		}
	}

}
