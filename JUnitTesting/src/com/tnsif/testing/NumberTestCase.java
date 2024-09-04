package com.tnsif.testing;

import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberTestCase {
	@Test
	@DisplayName("Factorial Test")
	public void factorialTest() {
		int exp=120;
		int act=Factorial.getFactorial(5);
		assertEquals(exp,act);
	}
	@Test
	@DisplayName("Not equal")
	public void Test2() {
		int exp=120;
		int act = Factorial.getFactorial(6);
		assertNotEquals(exp,act);
	}
	@Test
	@DisplayName("Positive")
	public void IsPositive() {
		int act=Factorial.getFactorial(2);
		assumeTrue(act > 0);
	}
	@Test
	@DisplayName("Negative")
	public void IsNegative() {
		int act=Factorial.getFactorial(5);
		assumeFalse(act<0);
	}
	@Test
	@DisplayName("Not Null")
	public void notNull() {
		Object obj = new Factorial();
		assumeNotNull(obj);
	}
}
