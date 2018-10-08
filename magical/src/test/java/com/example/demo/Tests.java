package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {


	@Test
	public void testMinMax() {

		com.example.demo.Test test = new com.example.demo.Test();
		assertEquals(true, test.isplayMagicalNumber(2, 6));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowException() {

		com.example.demo.Test test = new com.example.demo.Test();
		test.isplayMagicalNumber(12, 6);
	}


}
