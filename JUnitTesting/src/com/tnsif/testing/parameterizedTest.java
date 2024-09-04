package com.tnsif.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parameterizedTest {
	@ParameterizedTest
	@ValueSource(strings= {"roni","bali","njkfh","dnfjskhi"})
	void endswith(String str) {
		assertTrue(str.endsWith("i"));
	}
}
