package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.Factorial;
import com.capgemini.day5.MyCalculator;

class FactorialTest {
@Test
void testfactorialcalculate() throws Exception{
	Factorial f=new Factorial();
assertThrows(Exception.class, ()->Factorial.getFactorial(120));
	assertEquals(120,f.getFactorial(5));	
}
}