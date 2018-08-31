package com.capgemini.day5;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate() {
		super();
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean CheckDate() throws InvalidMonthException, InvalidDayException {
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			if(day<1 || day>31)
				throw new InvalidDayException("The entered day is invalid");
		}
		else if(month==4 || month==6 || month==9 || month==11)
		{
			if(day<1 || day>30)
			throw new InvalidDayException("The entered day is invalid");
		}
		else if(month==2) {
			if(year%4==0) 
			{
				if(day<1 || day >29)
					throw new InvalidDayException("The entered day is invalid");
			}
			else if(day<1 || day>28)
				throw new InvalidDayException("The entered day is invalid");
		}
		else
			throw new InvalidMonthException("The month entered is invalid");
		return true;
	}
	
}
