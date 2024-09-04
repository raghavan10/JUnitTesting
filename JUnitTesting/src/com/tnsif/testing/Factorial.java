package com.tnsif.testing;

public class Factorial {
	
	public static int getFactorial(int n) {
		 if (n == 0) {
	            return 1; // Base case: 0! is 1
	        } else {
	            return n * getFactorial(n - 1); // Recursive case
	        }
		
	}
}
