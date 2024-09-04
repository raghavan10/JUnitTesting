package com.tnsif.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

public class AssertionDemo {
	@Test
	public void checkassertequal() {
		int res=1;
		int exp=1;
		
		assertEquals(res,exp);
	}
	@Test
	public void testcheckassertequal() {
		assertFalse("Hello".contains("m"));
	}
	@Test
	public void testNull() {
		String a = "HEllo";
		assertNotNull(a);
	}
}
