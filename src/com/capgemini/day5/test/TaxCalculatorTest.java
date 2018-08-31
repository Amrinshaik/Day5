package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.capgemini.day5.CountryNotValidException;
import com.capgemini.day5.EmployeeNameNotValidException;
import com.capgemini.day5.TaxNotEligibleException;
import com.capgemini.day5.taxCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws TaxNotEligibleException, EmployeeNameNotValidException, CountryNotValidException {
    assertEquals(16000,taxCalculator.calculateTax("amrin",true,200000.0),0.04);
    assertEquals(3600,taxCalculator.calculateTax("amrin",true,60000.0),0.04);
    assertEquals(2000,taxCalculator.calculateTax("amrin",true,40000.0),0.04);
    assertEquals(800,taxCalculator.calculateTax("amrin",true,20000.0),0.04);
	}

	@Test
	void testCalculateTaxWithInvalidName() {
		 Exception e;
		 e=assertThrows(Exception.class, () -> taxCalculator.calculateTax("",true,200000.0));
		 assertEquals("The employee name cannot be empty",e.getMessage());
		 e=assertThrows(Exception.class, () -> taxCalculator.calculateTax(null,true,200000.0));
		 assertEquals("The employee name cannot be empty",e.getMessage());
	}


	@Test
	void testCalculateTaxIneligible() {
		Exception e;
		 e=assertThrows(Exception.class, () -> taxCalculator.calculateTax("amrin",true,2000.0));
		 assertEquals("The employee doesnot need to pay tax",e.getMessage());
	}
	
	@Test
	void testCalculateTaxWithInvalidCountry() {
		Exception e;
		 e=assertThrows(Exception.class, () -> taxCalculator.calculateTax("amrin",false,200000.0));
		 assertEquals("The employee should be an Indian citizen for calculating tax",e.getMessage());
	}
}
