package com.JUnit.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.JUnit.learning.Calc;

public class CalTest 
{
	@Test
	public void test() {
		Calc c=new Calc();
		int actual=c.divide(10, 5);
		int expectedResult=2;
		assertEquals(expectedResult, actual);
	}
	
}
