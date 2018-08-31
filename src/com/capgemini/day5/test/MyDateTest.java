package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.day5.InvalidDayException;
import com.capgemini.day5.InvalidMonthException;
import com.capgemini.day5.MyDate;

public class MyDateTest {
MyDate date1;
MyDate date2;
MyDate date3;
MyDate date4;

@Before
void setUp() {
	date1=new MyDate(29,1,1997);
	date2=new MyDate(28,2,1997);
	date3=new MyDate(26,13,1897);
	date4=new MyDate(31,3,2007);
}
@Test
void testWithValidInputs() throws InvalidMonthException, InvalidDayException{
	assertEquals(true, date1.CheckDate());
	assertEquals(true, date2.CheckDate());
}


}
