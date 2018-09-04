package com.capgemini.day5;

public class Factorial {
public static int getFactorial(int number) throws InvalidInputException,FactorialException{
	int factorial=1;
	if(number>=2)
	{
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
			if(!(factorial>0))
			
				throw new FactorialException();
			
		}
		return factorial;
	}
	else
	{
		throw new InvalidInputException();
	}
}
}