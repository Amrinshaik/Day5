package com.capgemini.day5;
import java.util.Scanner;
import com.capgemini.day5.AgeNotWithinRangeException;
import com.capgemini.day5.NameNotValidException;
public class StudentClient {


	public static void main(String[] args) {
		int rollNo;
		String name;
		int age;
		String course;
		Student student;
		student=new Student(123,"Amrin",20,"ece");
		
		try (Scanner scanner = new Scanner(System.in)) {
			
		System.out.print("Please enter your age = ");
		age=scanner.nextInt();
		
		if(student.ageValidation(age))		
		{
			System.out.print("Please enter your name = ");
			name=scanner.nextLine();
			if(student.nameValidation(name))
			{
			System.out.println("Please enter your rollNo = ");
			rollNo=scanner.nextInt();
			System.out.println("Please enter course = ");
			course=scanner.nextLine();
			}
		}
	}
		catch(AgeNotWithinRangeException e)
		 {
			System.out.println(e.getMessage());
		}
		catch(NameNotValidException e)
		{
			System.out.println(e.getMessage());
		}

}
}