package com.tnsif.testing;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumeDemo {
	@Test
	public void testAssumption() {
		int a=5,s=25;
		assumeFalse(s!=a*a);
		System.out.println("will it be displayed");
	}
	
	@Test
	public void test() {
		int a =6,b=5;
		assumingThat(a!=b,()->System.out.println("test will it be displayed"));
	}
}
